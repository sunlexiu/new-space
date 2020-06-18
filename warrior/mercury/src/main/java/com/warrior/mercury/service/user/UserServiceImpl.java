package com.warrior.mercury.service.user;

import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.ex.TPersonExMapper;
import com.warrior.mercury.mapper.ex.TSignupExMapper;
import com.warrior.mercury.model.entity.auto.TPerson;
import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.entity.auto.TSignupExample;
import com.warrior.mercury.model.param.user.ManagerUserQueryPage;
import com.warrior.mercury.util.SqlExecuteUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/11 11:49
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private TSignupExMapper signUpExMapper;

    @Resource
    private TPersonExMapper personMapper;

    @Override
    public List<TSignup> pageListSignUp(ManagerUserQueryPage page) {
        TSignupExample example = new TSignupExample();
        TSignupExample.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotBlank(page.getUsername())) {
            criteria.andLoginNameLike(SqlExecuteUtil.like(page.getUsername()));
        }

        if (!Objects.isNull(page.getDisabled())) {
            criteria.andDisabledEqualTo(page.getDisabled().byteValue());
        }

        return signUpExMapper.selectByExample(example);
    }

    @Override
    public TSignup selectSignUpById(Integer id) {
        return signUpExMapper.selectByPrimaryKey(id);
    }

    @Override
    public TSignup getSignUpDetail(String username) {
        TSignupExample example = new TSignupExample();
        example.createCriteria().andLoginNameEqualTo(username);
        List<TSignup> list = signUpExMapper.selectByExample(example);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public void insertSignUp(TSignup manager) {
        TSignup up = getSignUpDetail(manager.getLoginName());
        if (!Objects.isNull(up)) {
            throw new BusinessException(500, "用户名已存在!");
        }

        TPerson p = new TPerson();
        p.setFirstName(manager.getLoginName());
        personMapper.insertSelective(p);
        manager.setPersonID(p.getPersonID());
        signUpExMapper.insertSelective(manager);
    }

    @Override
    public void updateSignUp(TSignup manager) {
        TSignup userDB = selectSignUpById(manager.getSignUpID());
        if (Objects.isNull(userDB)) {
            throw new BusinessException(500, "用户不存在!");
        }
        signUpExMapper.updateByPrimaryKeySelective(manager);
    }

    @Override
    public void deleteSignUp(Integer id) {
        TSignup userDB = selectSignUpById(id);
        if (Objects.isNull(userDB)) {
            throw new BusinessException(500, "用户不存在!");
        }
        signUpExMapper.deleteByPrimaryKey(id);
    }
}
