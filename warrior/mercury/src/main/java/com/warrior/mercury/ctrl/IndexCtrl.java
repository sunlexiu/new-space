package com.warrior.mercury.ctrl;

import com.alibaba.fastjson.JSONObject;
import com.warrior.mercury.common.UserInfo;
import com.warrior.mercury.pojo.dto.Menu;
import com.warrior.mercury.pojo.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/9 9:39
 */
@Controller
public class IndexCtrl {

    private static final Logger LOG = LoggerFactory.getLogger(IndexCtrl.class);

    @RequestMapping("/login")
    public String index(HttpServletRequest httpServletRequest){
        String remoteUser = httpServletRequest.getRemoteUser();
        LOG.info("remoteUser:{}", remoteUser);
        return "/login";
    }

    @PostMapping({"/", "/login/in"})
    public String login(LoginVo vo){
        LOG.info(JSONObject.toJSONString(vo));
        return "index";
    }

    @RequestMapping("/menu")
    @ResponseBody
    public List<Menu> getMenu(){
        String json = "{\"id\":\"demoData\",\"name\":\"demoData\",\"parentId\":\"demoData\"," +
                "\"level\":1,\"url\":\"demoData\",\"order\":1,\"remarks\":\"demoData\",\"children\":{\"id\":\"demoData\"," +
                "\"name\":\"demoData\",\"parentId\":\"demoData\",\"level\":1,\"url\":\"/user/index\",\"order\":1,\"remarks\":\"demoData\"}}";
        List<Menu> list = new ArrayList<>();
        list.add(JSONObject.parseObject(json, Menu.class));
        return list;
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
