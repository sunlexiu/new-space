package com.warrior.mercury.service.phone;

import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.ex.TPhonePhoneNumberWechatExMapper;
import com.warrior.mercury.model.dto.Bind;
import com.warrior.mercury.model.entity.auto.TPhonePhoneNumberWechat;
import com.warrior.mercury.model.entity.auto.TPhonePhoneNumberWechatExample;
import com.warrior.mercury.model.param.bind.BindQueryPage;
import com.warrior.mercury.util.DateTimeFormatUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/19 13:43
 */
@Service
public class BindServiceImpl implements IBindService {

    @Resource
    private TPhonePhoneNumberWechatExMapper phonePhoneNumberWechatMapper;

    @Override
    public void bind(Integer id, Integer phoneId, Integer phoneNumberId, Integer wechatId) {
        checkLegality(id, phoneId, phoneNumberId, wechatId);
        TPhonePhoneNumberWechat link = constructLink(phoneId, phoneNumberId, wechatId);
        if (Objects.isNull(id)) {
            phonePhoneNumberWechatMapper.insert(link);
        } else {
            link.setPhonePhoneNumberWechatID(id);
            phonePhoneNumberWechatMapper.updateByPrimaryKey(link);
        }
    }

    @Override
    public List<Bind> pageList(BindQueryPage page) {
        return phonePhoneNumberWechatMapper.pageList(page);
    }

    @Override
    public void delete(Integer id) {
        checkDataExist(id);
        phonePhoneNumberWechatMapper.deleteByPrimaryKey(id);
    }

    private void checkDataExist(Integer id) {
        TPhonePhoneNumberWechat link = phonePhoneNumberWechatMapper.selectByPrimaryKey(id);
        if (Objects.isNull(link)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }

    private void checkLegality(Integer id, Integer phoneId, Integer phoneNumberId, Integer wechatId) {
        TPhonePhoneNumberWechatExample example = new TPhonePhoneNumberWechatExample();
        if (!Objects.isNull(phoneId)) {
            example.createCriteria().andPhoneIDEqualTo(phoneId);
        }

        if (!Objects.isNull(phoneNumberId)) {
            example.or().andPhoneNumberIDEqualTo(phoneNumberId);
        }

        if (!Objects.isNull(wechatId)) {
            example.or().andOperationWechatIDEqualTo(wechatId);
        }

        List<TPhonePhoneNumberWechat> wechatList = phonePhoneNumberWechatMapper.selectByExample(example);
        wechatList.forEach(v -> verification(id, phoneId, phoneNumberId, wechatId, v));
    }

    // 暂时就考虑以下情况, 因为手机可能同时开多个微信, 手机也可以双卡
    private void verification(Integer id, Integer phoneId, Integer phoneNumberId,
                              Integer wechatId, TPhonePhoneNumberWechat link) {
        // 手机号重复绑定微信
        if (!Objects.isNull(phoneNumberId) && phoneNumberId.equals(link.getPhoneNumberID())
                && !Objects.isNull(link.getOperationWechatID())
                && !link.getOperationWechatID().equals(wechatId)
                && !link.getPhonePhoneNumberWechatID().equals(id)) {
            throw new BusinessException(BusinessCode.DATA_REPEAT);
        }

        // 微信重复绑定手机号
        if (!Objects.isNull(wechatId) && wechatId.equals(link.getOperationWechatID())
                && !Objects.isNull(link.getPhoneNumberID())
                && !link.getPhoneNumberID().equals(phoneNumberId)
                && !link.getPhonePhoneNumberWechatID().equals(id)) {
            throw new BusinessException(BusinessCode.DATA_REPEAT);
        }

        // 手机号重复绑定手机
        if (!Objects.isNull(phoneNumberId) && phoneNumberId.equals(link.getPhoneNumberID())
                && !Objects.isNull(link.getPhoneID())
                && !link.getPhoneID().equals(phoneId)
                && !link.getPhonePhoneNumberWechatID().equals(id)) {
            throw new BusinessException(BusinessCode.DATA_REPEAT);
        }
    }

    private TPhonePhoneNumberWechat constructLink(Integer phoneId, Integer phoneNumberId, Integer wechatId) {
        TPhonePhoneNumberWechat link = new TPhonePhoneNumberWechat();
        link.setOperationWechatID(wechatId);
        link.setPhoneID(phoneId);
        link.setPhoneNumberID(phoneNumberId);
        link.setCreatedDateTime(DateTimeFormatUtil.formatNow(DateTimeFormatUtil.FormatEnum.DATE_TIME));
        return link;
    }
}
