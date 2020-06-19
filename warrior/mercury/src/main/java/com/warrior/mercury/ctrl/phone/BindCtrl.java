package com.warrior.mercury.ctrl.phone;

import com.warrior.mercury.model.dto.Bind;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.bind.BindParam;
import com.warrior.mercury.model.param.bind.BindQueryPage;
import com.warrior.mercury.service.phone.IBindService;
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
 * @create:       2020/6/19 13:42
 */
@RequestMapping("/bind")
@Controller
public class BindCtrl {

    @Resource
    private IBindService bindService;

    @GetMapping("/list")
    @ResponseBody
    public List<Bind> listUser(BindQueryPage page) {
        return bindService.pageList(page);
    }


    @PostMapping("/phone/wechat/number")
    @ResponseBody
    public void updatePhone(@RequestBody BindParam param) {
        bindService.bind(param.getPhonePhoneNumberWechatID(), param.getPhoneID(),
                param.getPhoneNumberID(), param.getOperationWechatID());
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {
        bindService.delete(body.getId());
    }


}
