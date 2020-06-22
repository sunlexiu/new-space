package com.warrior.mercury.ctrl.phone;

import com.warrior.mercury.common.ResponsePage;
import com.warrior.mercury.model.dto.PhoneNumberInfo;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoAddParam;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoQuery;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoUpdateParam;
import com.warrior.mercury.service.phone.IPhoneNumberInfoService;
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
 * @create:       2020/6/17 11:49
 */
@RequestMapping("/phone/number/info")
@Controller
public class PhoneNumberInfoCtrl {

    @Resource
    private IPhoneNumberInfoService phoneNumberInfoService;

    @GetMapping("/index")
    public String index() {
        return "/view/phone/number/info/list";
    }


    @GetMapping("/list")
    @ResponseBody
    public ResponsePage<PhoneNumberInfo> listUser(PhoneNumberInfoQuery page) {
        return ResponsePage.newPage(phoneNumberInfoService.listPhoneNumberInfo(page));
    }


    @PostMapping("/add")
    @ResponseBody
    public void addPhone(@RequestBody PhoneNumberInfoAddParam param) {
        phoneNumberInfoService.addPhoneNumber(param);
    }


    @PostMapping("/update")
    @ResponseBody
    public void updatePhone(@RequestBody PhoneNumberInfoUpdateParam param) {
        phoneNumberInfoService.updatePhoneNumber(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {
        phoneNumberInfoService.deletePhoneNumber(body.getId());
    }
}
