package com.warrior.mercury.ctrl.user;

import com.warrior.mercury.ctrl.IndexCtrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author:       Charon
 * @create:       2020/6/9 11:17
 */
public class UserCtrl {

    private static final Logger LOG = LoggerFactory.getLogger(IndexCtrl.class);

    @RequestMapping("login")
    @ResponseBody
    public Map<String,Object> login(HttpServletRequest request, HttpSession session){
        return null;

    }
}
