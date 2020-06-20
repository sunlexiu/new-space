package com.warrior.mercury.service.customer;

import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TTitleMapper;
import com.warrior.mercury.mapper.auto.TWeChatCustomerEvaluationMapper;
import com.warrior.mercury.mapper.auto.TWechatCustomerActivitySourceMapper;
import com.warrior.mercury.mapper.auto.TWechatCustomerAddingSourceMapper;
import com.warrior.mercury.mapper.ex.TOperationWechatCustomerExMapper;
import com.warrior.mercury.mapper.ex.TPersonExMapper;
import com.warrior.mercury.mapper.ex.TWeChatCustomerExMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.dto.WechatCustomer;
import com.warrior.mercury.model.entity.auto.TOperationWechatCustomer;
import com.warrior.mercury.model.entity.auto.TOperationWechatCustomerExample;
import com.warrior.mercury.model.entity.auto.TPerson;
import com.warrior.mercury.model.entity.auto.TTitle;
import com.warrior.mercury.model.entity.auto.TWeChatCustomer;
import com.warrior.mercury.model.entity.auto.TWeChatCustomerEvaluation;
import com.warrior.mercury.model.entity.auto.TWechatCustomerActivitySource;
import com.warrior.mercury.model.entity.auto.TWechatCustomerAddingSource;
import com.warrior.mercury.model.param.customer.OperatorCustomer;
import com.warrior.mercury.model.param.customer.WechatCustomerAlterParam;
import com.warrior.mercury.model.param.customer.WechatCustomerQueryPage;
import com.warrior.mercury.util.DateTimeFormatUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.warrior.mercury.common.exception.BusinessCode.DATA_NOT_EXIST;

/**
 * @author:       Charon
 * @create:       2020/6/18 17:38
 */
@Service
public class WechatCustomerServiceImpl implements IWechatCustomerService {

    @Resource
    private TWeChatCustomerExMapper weChatCustomerExMapper;

    @Resource
    private TPersonExMapper personExMapper;

    @Resource
    private TWechatCustomerActivitySourceMapper wechatCustomerActivitySourceMapper;

    @Resource
    private TWechatCustomerAddingSourceMapper wechatCustomerAddingSourceMapper;

    @Resource
    private TTitleMapper titleMapper;

    @Resource
    private TWeChatCustomerEvaluationMapper weChatCustomerEvaluationMapper;

    @Resource
    private TOperationWechatCustomerExMapper operationWechatCustomerMapper;

    @Override
    public List<WechatCustomer> pageList(WechatCustomerQueryPage page) {
        return weChatCustomerExMapper.pageList(page);
    }

    @Override
    public void add(WechatCustomerAlterParam param) {
        checkLegality(param);
        param.setRecordedDateTime(DateTimeFormatUtil.formatNow(DateTimeFormatUtil.FormatEnum.DATE_TIME));
        weChatCustomerExMapper.insertSelective(param);
    }

    @Override
    public void update(WechatCustomerAlterParam param) {
        checkDataExist(param.getWeChatCustomerID());
        weChatCustomerExMapper.updateByPrimaryKeySelective(param);
    }

    @Override
    public void delete(Integer id) {
        checkDataExist(id);
        weChatCustomerExMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<CommonSimpleDto> listWechatOperatorByCustomerId(Integer customerId) {
        return weChatCustomerExMapper.listWechatOperatorByCustomerId(customerId);
    }

    @Override
    public void adjustOperationWechat(OperatorCustomer operatorCustomer) {
        TOperationWechatCustomerExample example = new TOperationWechatCustomerExample();
        example.createCriteria().andWeChatCustomerIDEqualTo(operatorCustomer.getWeChatCustomerID());
        operationWechatCustomerMapper.deleteByExample(example);
        List<TOperationWechatCustomer> linkList = constructLinkList(operatorCustomer);
        if (!CollectionUtils.isEmpty(linkList)) {
            operationWechatCustomerMapper.insertBatch(linkList);
        }
    }

    private void checkDataExist(Integer id) {
        TWeChatCustomer customer = weChatCustomerExMapper.selectByPrimaryKey(id);
        if (Objects.isNull(customer)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }
    }

    private void checkLegality(WechatCustomerAlterParam param) {
        TPerson person = personExMapper.selectEffectiveOperatorByPrimaryKey(param.getRecorderID());
        if (Objects.isNull(person)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        TWechatCustomerActivitySource activitySource =
                wechatCustomerActivitySourceMapper.selectByPrimaryKey(param.getWeChatCustomerActivitySourceID());
        if (Objects.isNull(activitySource)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        TWechatCustomerAddingSource addingSource =
                wechatCustomerAddingSourceMapper.selectByPrimaryKey(param.getWeChatCustomerAddingSourceID());
        if (Objects.isNull(addingSource)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        TTitle title = titleMapper.selectByPrimaryKey(param.getTitleID());
        if (Objects.isNull(title)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        TWeChatCustomerEvaluation evaluation = weChatCustomerEvaluationMapper
                .selectByPrimaryKey(param.getWeChatCustomerEvaluationID());
        if (Objects.isNull(evaluation)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }
    }

    private List<TOperationWechatCustomer> constructLinkList(OperatorCustomer operatorCustomer) {
        List<Integer> list = operatorCustomer.getOperatorWechatList();
        if (Objects.isNull(list)) {
            return Collections.emptyList();
        }

        return IntStream.range(0, list.size()).mapToObj(v -> {
            TOperationWechatCustomer customer = new TOperationWechatCustomer();
            customer.setOperationWechatID(list.get(v));
            customer.setWeChatCustomerID(operatorCustomer.getWeChatCustomerID());
            customer.setOrderID(Integer.valueOf(v).shortValue());
            return customer;
        }).collect(Collectors.toList());
    }
}
