package com.warrior.mercury.ctrl;

import com.alibaba.fastjson.JSONObject;
import com.warrior.mercury.pojo.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/9 9:39
 */
@Controller
public class IndexCtrl {

    private static final Logger LOG = LoggerFactory.getLogger(IndexCtrl.class);

    @RequestMapping({"/", "/login"})
    public String index(HttpServletRequest httpServletRequest){
        String remoteUser = httpServletRequest.getRemoteUser();
        LOG.info("remoteUser:{}", remoteUser);
        return "login";
    }

    @PostMapping({"/login/in"})
    public String login(@RequestBody LoginVo vo){
        LOG.info(JSONObject.toJSONString(vo));
        return "index";
    }



    @RequestMapping("/register")
    public String register(Model model){
        return "register";
    }

    @RequestMapping("/user/info")
    public Object whoIm(){
        return SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

}
