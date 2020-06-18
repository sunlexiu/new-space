package com.warrior.mercury.service.wechat;

import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TOperationWechatMapper;
import com.warrior.mercury.model.dto.OperatorWechat;
import com.warrior.mercury.model.entity.auto.TOperationWechat;
import com.warrior.mercury.model.entity.auto.TOperationWechatExample;
import com.warrior.mercury.model.param.wechat.OperatorWechatAlterParam;
import com.warrior.mercury.model.param.wechat.OperatorWechatQueryPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author:       Charon
 * @create:       2020/6/17 20:12
 */
@Service
public class OperatorWechatServiceImpl implements IOperatorWechatService {

    @Resource
    private TOperationWechatMapper operationWechatMapper;

    @Override
    public List<OperatorWechat> pageListOperateWechat(OperatorWechatQueryPage page) {
        TOperationWechatExample example = new TOperationWechatExample();
        return operationWechatMapper.selectByExample(example).stream()
                .map(OperatorWechat::convertFromDBType).collect(Collectors.toList());
    }

    @Override
    public void addOperateWechat(OperatorWechatAlterParam param) {
        checkLegality(param);
        operationWechatMapper.insertSelective(param);
    }

    @Override
    public void updateOperateWechat(OperatorWechatAlterParam param) {
        checkDataExist(param.getOperationWechatID());
        checkLegality(param);
        operationWechatMapper.updateByPrimaryKeySelective(param);
    }

    @Override
    public void deleteOperateWechat(Integer id) {
        checkDataExist(id);
        operationWechatMapper.deleteByPrimaryKey(id);
    }

    private void checkDataExist(Integer id) {
        TOperationWechat wechat = operationWechatMapper.selectByPrimaryKey(id);
        if (Objects.isNull(wechat)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }

    private void checkLegality(OperatorWechatAlterParam param) {
        // 微信号和微信编号不可重复
        TOperationWechatExample example = new TOperationWechatExample();
        example.createCriteria().andWechatIDEqualTo(param.getWechatID());
        example.or().andWechatNoEqualTo(param.getWechatNo());
        List<TOperationWechat> list = operationWechatMapper.selectByExample(example);
        list.forEach(v -> {
            if (!v.getOperationWechatID().equals(param.getOperationWechatID())) {
                throw new BusinessException(BusinessCode.DATA_REPEAT);
            }
        });
    }
}
