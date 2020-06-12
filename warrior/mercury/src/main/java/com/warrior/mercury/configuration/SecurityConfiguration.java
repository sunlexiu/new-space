package com.warrior.mercury.configuration;

import com.warrior.mercury.common.Constant;
import com.warrior.mercury.util.StaticResourcesScanUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;
import java.io.FileNotFoundException;

import static com.warrior.mercury.common.Constant.STATIC_RESOURCES_DIR;

/**
 * @author:       Charon
 * @create:       2020/6/9 21:19
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Resource
    private AuthenticationProvider provider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
//                .loginPage("/login.html")
                .loginProcessingUrl("/login/in")
                .defaultSuccessUrl("/index", true)
                .and().authorizeRequests()
                .antMatchers("/", "/login").permitAll()
                .antMatchers(HttpMethod.GET, Constant.PAGE_RESOURCES_PREFIX).permitAll()
                .antMatchers(HttpMethod.GET, getStaticResourcesDir()).permitAll()
                .and().authorizeRequests().anyRequest().authenticated()
                .and().headers().frameOptions().disable()
                .and().csrf().disable();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(provider);
    }

    private String[] getStaticResourcesDir() throws FileNotFoundException {
        return StaticResourcesScanUtil.scanDirectStaticResourcesDir(STATIC_RESOURCES_DIR);
    }

}
