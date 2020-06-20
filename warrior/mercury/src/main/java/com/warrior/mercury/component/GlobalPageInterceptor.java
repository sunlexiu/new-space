package com.warrior.mercury.component;

import com.github.pagehelper.PageHelper;
import com.warrior.mercury.model.param.Page;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import java.util.Objects;

/**
 * mybatis分页拦截器, 注入分页参数
 *
 * @author:       Charon
 * @create:       2020/6/20 15:25
 */
@Intercepts({
    @Signature(type = Executor.class, method = "query",
            args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
    @Signature(type = Executor.class, method = "query",
            args = {MappedStatement.class, Object.class, RowBounds.class,
                    ResultHandler.class, CacheKey.class, BoundSql.class})
})
public class GlobalPageInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        Object[] args = invocation.getArgs();
        Object parameter = args[1];
        if (parameter instanceof Page) {
            Page page = (Page) parameter;
            String orderBy = page.orderBy();
            if (Objects.isNull(orderBy)) {
                PageHelper.startPage(page.page(), page.size());
            } else {
                PageHelper.startPage(page.page(), page.size(), orderBy);
            }
        }

        return invocation.proceed();
    }


}
