package com.warrior.mercury.service.user;

import com.warrior.mercury.mapper.auto.TPersonMapper;
import com.warrior.mercury.mapper.auto.TSignupMapper;
import com.warrior.mercury.model.entity.auto.TPerson;
import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.entity.auto.TSignupExample;
import com.warrior.mercury.model.vo.query.page.BasePage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author:       Charon
 * @create:       2020/6/11 11:49
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private TSignupMapper signupMapper;

    @Resource
    private TPersonMapper personMapper;

    @Override
    public List<TSignup> pageListSignUp(BasePage page, Map<String, Object> conditionMap) {
        TSignupExample example = new TSignupExample();
        return signupMapper.selectByExample(example);
    }

    @Override
    public void insertSignUp(TSignup manager) {
        TPerson p = new TPerson();
        p.setFirstName(manager.getLoginname());
        personMapper.insertSelective(p);
        manager.setPersonid(p.getPersonID());
        signupMapper.insertSelective(manager);
    }

    @Override
    public TSignup updateSignUp(TSignup manager) {
        return null;
    }

    @Override
    public void deleteSignUp(Integer id) {

    }
}
