package com.warrior.mercury.ctrl.phone;

import com.warrior.mercury.common.ResponsePage;
import com.warrior.mercury.model.dto.PhoneNumberRecord;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordAddParam;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordQueryPage;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordUpdateParam;
import com.warrior.mercury.service.phone.IPhoneNumberRecordService;
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
 * @create:       2020/6/17 14:39
 */
@Controller
@RequestMapping("/phone/number/record")
public class PhoneNumberRecordCtrl {

    @Resource
    private IPhoneNumberRecordService phoneNumberRecordService;

    @GetMapping("/index")
    public String index() {
        return "/view/phone/number/record/list";
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponsePage<PhoneNumberRecord> listUser(PhoneNumberRecordQueryPage page) {
        return ResponsePage.newPage(phoneNumberRecordService.listPhoneNumberUsingRecord(page));
    }

    @PostMapping("/add")
    @ResponseBody
    public void addPhoneNumberRecord(@RequestBody PhoneNumberRecordAddParam param) {
        phoneNumberRecordService.addPhoneUsingRecord(param);
    }


    @PostMapping("/update")
    @ResponseBody
    public void updatePhoneNumberRecord(@RequestBody PhoneNumberRecordUpdateParam param) {
        phoneNumberRecordService.updatePhoneUsingRecord(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhoneNumberRecord(@RequestBody DeleteBody body) {
        phoneNumberRecordService.deletePhoneUsingRecord(body.getId());
    }
}
