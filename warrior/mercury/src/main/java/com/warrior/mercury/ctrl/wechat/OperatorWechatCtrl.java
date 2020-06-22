package com.warrior.mercury.ctrl.wechat;

import com.warrior.mercury.common.ResponsePage;
import com.warrior.mercury.model.dto.OperatorWechat;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.wechat.OperatorWechatAlterParam;
import com.warrior.mercury.model.param.wechat.OperatorWechatQueryPage;
import com.warrior.mercury.service.wechat.IOperatorWechatService;
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
 * @create:       2020/6/17 20:00
 */
@Controller
@RequestMapping("/wechat/operator")
public class OperatorWechatCtrl {

    @Resource
    private IOperatorWechatService operatorWechatService;

    @GetMapping("/index")
    public String index() {
        return "/view/wechat/operator/list";
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponsePage<OperatorWechat> listUser(OperatorWechatQueryPage page) {
        return ResponsePage.newPage(operatorWechatService.pageListOperateWechat(page));
    }

    @PostMapping("/add")
    @ResponseBody
    public void addPhone(@RequestBody OperatorWechatAlterParam param) {
        operatorWechatService.addOperateWechat(param);
    }

    @PostMapping("/update")
    @ResponseBody
    public void updatePhone(@RequestBody OperatorWechatAlterParam param) {
        operatorWechatService.updateOperateWechat(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {
        operatorWechatService.deleteOperateWechat(body.getId());
    }

}
