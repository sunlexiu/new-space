package com.warrior.mercury.service.impl;

import com.warrior.mercury.mapper.OrderMapper;
import com.warrior.mercury.pojo.TOrder;
import com.warrior.mercury.service.ISayHelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/1 21:57
 */
@Service
public class SayHelloServiceImpl implements ISayHelloService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<TOrder> listAll() {
        return orderMapper.listAll();
    }

}
