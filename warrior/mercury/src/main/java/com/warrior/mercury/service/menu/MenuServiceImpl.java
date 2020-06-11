package com.warrior.mercury.service.menu;

import com.alibaba.fastjson.JSONObject;
import com.warrior.mercury.model.dto.Menu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/11 11:59
 */
@Service
public class MenuServiceImpl implements IMenuService {

    private static final Logger LOG = LoggerFactory.getLogger(MenuServiceImpl.class);

    @Resource
    private List<Menu> menuList;

    @Override
    public List<Menu> listMenu(Collection<String> roleCollection) {
        LOG.info(JSONObject.toJSONString(roleCollection));
        return menuList;
    }
}
