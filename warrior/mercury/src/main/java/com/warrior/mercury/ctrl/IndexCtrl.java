package com.warrior.mercury.ctrl;

import com.warrior.mercury.model.dto.Menu;
import com.warrior.mercury.service.menu.IMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/9 9:39
 */
@Controller
public class IndexCtrl {

    private static final Logger LOG = LoggerFactory.getLogger(IndexCtrl.class);

    @Resource
    private IMenuService menuService;

    @GetMapping({"/", "/login"})
    public String login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            return "forward:index";
        }
        return "login_page";
    }

    @GetMapping("/index")
    public String index() {
        LOG.info("user:{}", SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal());
        return "index";
    }

    @RequestMapping("/login/fail")
    public String loginFail() {
        return "login_fail";
    }

    @GetMapping({"/home"})
    public String home() {
        return "view/home";
    }

    @RequestMapping("/menu")
    @ResponseBody
    public List<Menu> getMenu(Authentication authentication){
        return menuService.listMenu(Collections.emptyList());
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
