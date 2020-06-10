package com.warrior.mercury.component;

import com.warrior.mercury.common.UserInfo;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * @author:       Charon
 * @create:       2020/6/9 21:37
 */
@Component
public class SysAuthenticationProvider implements AuthenticationProvider {

    @Resource
    private UserDetailsService userService;

    @Override
    public Authentication authenticate(Authentication authentication)
            throws AuthenticationException {
        String userName = authentication.getName();
        String password = (String) authentication.getCredentials();
        // 这里构建来判断用户是否存在和密码是否正确
        UserInfo userInfo = (UserInfo) userService.loadUserByUsername(userName);
        if (userInfo == null) {
            throw new BadCredentialsException("用户名不存在");
        }

        if (!userInfo.getPassword().equals("123456")) {
            throw new BadCredentialsException("密码不正确");
        }
        Collection<? extends GrantedAuthority> authorities =
                userInfo.getAuthorities();
        // 构建返回的用户登录成功的token
        return new UsernamePasswordAuthenticationToken(
                userInfo, password, authorities);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
