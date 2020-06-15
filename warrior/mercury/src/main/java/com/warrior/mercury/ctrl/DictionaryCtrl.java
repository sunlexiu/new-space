package com.warrior.mercury.ctrl;

import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
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

}
