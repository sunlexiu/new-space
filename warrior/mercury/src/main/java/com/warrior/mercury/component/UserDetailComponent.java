package com.warrior.mercury.component;

import com.warrior.mercury.common.UserInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @author:       Charon
 * @create:       2020/6/9 21:32
 */
@Component
public class UserDetailComponent implements UserDetailsService {

    private static String defaultUser = "admin";

    @Override
    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {
        if (defaultUser.equals(userName)) {
            UserInfo userInfo=new UserInfo("admin",
                    "123456", "ROLE_ADMIN",
                    true,true,
                    true, true);
            return userInfo;
        }

        return null;
    }
}
