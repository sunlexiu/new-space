package com.warrior.mercury.ctrl;

import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhonenumberpurpose;
import com.warrior.mercury.model.entity.auto.TPhonenumberstate;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.entity.auto.TPhonestate;
import com.warrior.mercury.service.dictionary.IDictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 17:38
 */
@RequestMapping("/dictionary")
@Controller
public class DictionaryCtrl {

    @Resource
    private IDictionaryService dictionaryService;

    @GetMapping("/phone")
    @ResponseBody
    public List<CommonSimpleDto> listAllPhone() {
        return dictionaryService.listAllPhone();
    }

    @GetMapping("/phone/brand")
    @ResponseBody
    public List<TPhonebrand> listAllPhoneBrand() {
        return dictionaryService.listAllPhoneBrand();
    }

    @GetMapping("/phone/system")
    @ResponseBody
    public List<TPhoneoperatingsystem> listAllPhoneOperatingSystem() {
        return dictionaryService.listAllPhoneOperatingSystem();
    }

    @GetMapping("/phone/user")
    @ResponseBody
    public List<CommonSimpleDto> listAllPhoneUser() {
        return dictionaryService.listAllPhoneUser();
    }

    @GetMapping("/phone/state")
    @ResponseBody
    public List<TPhonestate> listAllPhoneState() {
        return dictionaryService.listAllPhoneState();
    }


    @GetMapping("/phone/number")@ResponseBody
    public List<CommonSimpleDto> listAllPhoneNumber() {
        return dictionaryService.listAllPhoneNumber();
    }

    @GetMapping("/phone/number/purpose")
    @ResponseBody
    public List<TPhonenumberpurpose> listAllPhoneNumberPurpose() {
        return dictionaryService.listAllPhoneNumberPurpose();
    }

    @GetMapping("/phone/number/state")
    @ResponseBody
    public List<TPhonenumberstate> listAllPhoneNumberState() {
        return dictionaryService.listAllPhoneNumberState();
    }
}
