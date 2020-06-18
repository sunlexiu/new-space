package com.warrior.mercury.service.wechat;

import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TOperationWechatStateMapper;
import com.warrior.mercury.mapper.auto.TWechatPurposeMapper;
import com.warrior.mercury.mapper.ex.TOperationWechatExMapper;
import com.warrior.mercury.mapper.ex.TOperationWechatUsingLogExMapper;
import com.warrior.mercury.mapper.ex.TPersonExMapper;
import com.warrior.mercury.model.dto.WechatUsingRecord;
import com.warrior.mercury.model.entity.auto.TOperationWechat;
import com.warrior.mercury.model.entity.auto.TOperationWechatState;
import com.warrior.mercury.model.entity.auto.TOperationWechatUsingLog;
import com.warrior.mercury.model.entity.auto.TPerson;
import com.warrior.mercury.model.entity.auto.TWechatPurpose;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordAlterParam;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordQueryPage;
import com.warrior.mercury.util.DateTimeFormatUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/18 14:35
 */
@Service
public class WechatUsingRecordServiceImpl implements IWechatUsingRecordService {

    @Resource
    private TOperationWechatUsingLogExMapper operationWechatUsingLogExMapper;

    @Resource
    private TOperationWechatExMapper operationWechatExMapper;

    @Resource
    private TOperationWechatStateMapper operationWechatStateMapper;

    @Resource
    private TWechatPurposeMapper wechatPurposeMapper;

    @Resource
    private TPersonExMapper personExMapper;


    @Override
    public List<WechatUsingRecord> pageList(WechatUsingRecordQueryPage page) {
        return operationWechatUsingLogExMapper.pageList(page);
    }

    @Override
    public void add(WechatUsingRecordAlterParam param) {
        checkLegality(param);
        // 将该微信上一次的使用记录结束时间设置为当前时间
        operationWechatUsingLogExMapper.updateRecordEndDate(param.getOperationWechatID());
        param.setCreatedDateTime(DateTimeFormatUtil.formatNow(DateTimeFormatUtil.FormatEnum.DATE_TIME));
        operationWechatUsingLogExMapper.insertSelective(param);
    }

    @Override
    public void delete(Integer id) {
        checkDataExist(id);
        operationWechatUsingLogExMapper.deleteByPrimaryKey(id);
    }

    private void checkDataExist(Integer id) {
        TOperationWechatUsingLog log = operationWechatUsingLogExMapper.selectByPrimaryKey(id);
        if (Objects.isNull(log)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }

    private void checkLegality(WechatUsingRecordAlterParam param) {
        TOperationWechat wechat = operationWechatExMapper.selectByPrimaryKey(param.getOperationWechatID());
        if (Objects.isNull(wechat)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TOperationWechatState state = operationWechatStateMapper.selectByPrimaryKey(param.getOperationWechatStateID());
        if (Objects.isNull(state)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TWechatPurpose purpose = wechatPurposeMapper.selectByPrimaryKey(param.getWechatPurposeID());
        if (Objects.isNull(purpose)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TPerson person = personExMapper.selectEffectiveOperatorByPrimaryKey(param.getOperationWechatPersonID());
        if (Objects.isNull(person)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }
}
