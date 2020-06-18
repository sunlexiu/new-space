package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPersonMapper;
import com.warrior.mercury.model.entity.auto.TPerson;

/**
 * @author:       Charon
 * @create:       2020/6/18 16:19
 */
public interface TPersonExMapper extends TPersonMapper {

    /**
     * 根据id查找有效的运营人员
     *
     * @param id
     * @return
     */
    TPerson selectEffectiveOperatorByPrimaryKey(Integer id);
}
