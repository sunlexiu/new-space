package com.warrior.mercury.ctrl.phone;

import com.warrior.mercury.model.dto.PhoneRecord;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.phone.PhoneRecordAddParam;
import com.warrior.mercury.model.param.phone.PhoneRecordQueryPage;
import com.warrior.mercury.model.param.phone.PhoneRecordUpdateParam;
import com.warrior.mercury.service.phone.IPhoneRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 9:00
 */
@Controller
@RequestMapping("/phone/record")
public class PhoneRecordCtrl {

    @Resource
    private IPhoneRecordService phoneRecordService;

    @GetMapping("/index")
    public String index() {
        return "/view/phone/record/list";
    }


    @GetMapping("/list")
    @ResponseBody
    public List<PhoneRecord> listUser(PhoneRecordQueryPage page) {
        return phoneRecordService.listPhoneUsingRecord(page);
    }


    @PostMapping("/add")
    @ResponseBody
    public void addPhone(@RequestBody PhoneRecordAddParam param) {
        phoneRecordService.addPhoneUsingRecord(param);
    }


    @PostMapping("/update")
    @ResponseBody
    public void updatePhone(@RequestBody PhoneRecordUpdateParam param) {
        phoneRecordService.updatePhoneUsingRecord(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {
        phoneRecordService.deletePhoneUsingRecord(body.getId());
    }
}
