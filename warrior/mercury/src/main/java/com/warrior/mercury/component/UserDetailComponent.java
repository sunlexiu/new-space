package com.warrior.mercury.component;

import com.warrior.mercury.common.UserInfo;
import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.service.user.IUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/9 21:32
 */
@Component
public class UserDetailComponent implements UserDetailsService {

    private static String defaultUser = "admin";

    @Resource
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        TSignup user = userService.getSignUpDetail(userName);
        if (Objects.isNull(user)) {
            return null;
        }

        return new UserInfo(user.getLoginname(), user.getPassword(),
                "ROLE_ADMIN",true,true,
                true, true);
    }
}
