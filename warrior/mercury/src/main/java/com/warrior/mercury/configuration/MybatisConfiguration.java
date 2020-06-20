package com.warrior.mercury.configuration;

import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration;
import com.warrior.mercury.component.GlobalPageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/20 15:31
 */
@Configuration
@AutoConfigureAfter(PageHelperAutoConfiguration.class)
public class MybatisConfiguration {

    @Resource
    private List<SqlSessionFactory> sqlSessionFactoryList;

    @PostConstruct
    public void addInterceptor() {
        GlobalPageInterceptor interceptor = new GlobalPageInterceptor();
        sqlSessionFactoryList.forEach(v -> v.getConfiguration().addInterceptor(interceptor));
    }

}
