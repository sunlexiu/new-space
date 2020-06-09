package com.warrior.mercury.ctrl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/9 9:39
 */
@Controller
public class IndexCtrl {

    private static final Logger LOG = LoggerFactory.getLogger(IndexCtrl.class);

    @RequestMapping({"/", "/index"})
    public String login(HttpServletRequest httpServletRequest){
        String remoteUser = httpServletRequest.getRemoteUser();
        LOG.info("remoteUser:{}", remoteUser);
        if(Objects.isNull(remoteUser)) {
            return "login";
        } else {
            return "index";
        }
    }

    @RequestMapping("/register")
    public String register(Model model){
        return "register";
    }



//    @RequestMapping({"/home"})
//    public String home() {
//        return "view/home";
//    }
//
//    @RequestMapping({"/test"})
//    public String test() {
//        return "test";
//    }
//
//    @RequestMapping("/404")
//    public String error() {
//        return "error404";
//    }
//
//    @RequestMapping("/login")
//    public String login(){
//        return "login";
//    }

}
