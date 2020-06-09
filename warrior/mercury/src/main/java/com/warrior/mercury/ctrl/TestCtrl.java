package com.warrior.mercury.ctrl;

import com.warrior.mercury.pojo.TOrder;
import com.warrior.mercury.service.ISayHelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/1 21:35
 */
@RestController
@RequestMapping("/test")
public class TestCtrl {

    @Resource
    private ISayHelloService sayHelloService;

    @GetMapping("")
    public List<TOrder> sayHello() {
        return sayHelloService.listAll();
    }
}
