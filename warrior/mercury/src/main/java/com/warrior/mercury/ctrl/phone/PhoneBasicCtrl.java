package com.warrior.mercury.ctrl.phone;

import com.warrior.mercury.common.ResponsePage;
import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.phone.BasicPhoneAddParam;
import com.warrior.mercury.model.param.phone.BasicPhoneUpdateParam;
import com.warrior.mercury.model.param.phone.PhoneBasicQueryPage;
import com.warrior.mercury.service.phone.IPhoneBasicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:07
 */
@Controller
@RequestMapping("/phone/basic")
public class PhoneBasicCtrl {

    @Resource
    private IPhoneBasicService phoneBasicService;

    @GetMapping("/index")
    public String index() {
        return "/view/phone/basic/list";
    }


    @GetMapping("/list")
    @ResponseBody
    public ResponsePage<PhoneBasic> listUser(PhoneBasicQueryPage page) {
        return ResponsePage.newPage(phoneBasicService.listBasicPhoneInfo(page));
    }


    @PostMapping("/add")
    @ResponseBody
    public void addPhone(@RequestBody BasicPhoneAddParam param) {
        phoneBasicService.addBasicPhone(param);
    }


    @PostMapping("/update")
    @ResponseBody
    public void updatePhone(@RequestBody BasicPhoneUpdateParam param) {
        phoneBasicService.updateBasicPhone(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {
        phoneBasicService.deletePhone(body.getId());
    }

}
