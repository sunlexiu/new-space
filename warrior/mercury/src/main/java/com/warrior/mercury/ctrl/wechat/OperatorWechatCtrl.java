package com.warrior.mercury.ctrl.wechat;

import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.phone.BasicPhoneAddParam;
import com.warrior.mercury.model.param.phone.BasicPhoneUpdateParam;
import com.warrior.mercury.model.param.phone.PhoneBasicQueryPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 20:00
 */
@Controller
@RequestMapping("/wechat/operator")
public class OperatorWechatCtrl {

    @GetMapping("/index")
    public String index() {
        return "/view/wechat/operator/list";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<PhoneBasic> listUser(PhoneBasicQueryPage page) {
        return null;
    }


    @PostMapping("/add")
    @ResponseBody
    public void addPhone(@RequestBody BasicPhoneAddParam param) {

    }


    @PostMapping("/update")
    @ResponseBody
    public void updatePhone(@RequestBody BasicPhoneUpdateParam param) {

    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {

    }

}
