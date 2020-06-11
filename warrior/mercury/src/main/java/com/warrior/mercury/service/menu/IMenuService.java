package com.warrior.mercury.service.menu;


import com.warrior.mercury.model.dto.Menu;

import java.util.Collection;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/11 11:57
 */
public interface IMenuService {

    /**
     * 根据当前角色展示其菜单
     *
     * @param roleCollection
     * @return
     */
    List<Menu> listMenu(Collection<String> roleCollection);
}
