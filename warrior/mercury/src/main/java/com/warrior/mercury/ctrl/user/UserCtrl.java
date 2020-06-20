package com.warrior.mercury.ctrl.user;

import com.alibaba.fastjson.JSONObject;
import com.warrior.mercury.common.ResponsePage;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.ctrl.IndexCtrl;
import com.warrior.mercury.model.dto.ManageUser;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.user.ManagerUserAddParam;
import com.warrior.mercury.model.param.user.ManagerUserQueryPage;
import com.warrior.mercury.model.param.user.ManagerUserUpdateParam;
import com.warrior.mercury.service.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/9 11:17
 */
@Controller
@RequestMapping("/user")
public class UserCtrl {

    private static final Logger LOG = LoggerFactory.getLogger(IndexCtrl.class);

    @Resource
    private IUserService userService;

    @GetMapping("/index")
    public String index() {
        LOG.info("user:{}", SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal());
        return "view/admin/user/list";
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponsePage<ManageUser> listUser(ManagerUserQueryPage page) {
        return ResponsePage.newPage(userService.pageListSignUp(page));
    }

    @RequestMapping("/add")
    @ResponseBody
    public void addUser(@RequestBody ManagerUserAddParam user) {
        LOG.info(JSONObject.toJSONString(user));
        userService.insertSignUp(user.convertToSignUp());
    }

    @PostMapping("/update")
    @ResponseBody
    public ManageUser updateUser(@RequestBody ManagerUserUpdateParam user) {
        LOG.info(JSONObject.toJSONString(user));
        if (Objects.isNull(user.getId())) {
            throw new BusinessException(500, "参数错误");
        }

        userService.updateSignUp(user.convertToSignUp());
        return ManageUser.convertFromSignUpUser(userService.selectSignUpById(user.getId()));
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deleteUser(@RequestBody DeleteBody body) {
        userService.deleteSignUp(body.getId());
    }

}
