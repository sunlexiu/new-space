package com.warrior.mercury.ctrl.wechat;

import com.warrior.mercury.common.ResponsePage;
import com.warrior.mercury.model.dto.WechatUsingRecord;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordAlterParam;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordQueryPage;
import com.warrior.mercury.service.wechat.IWechatUsingRecordService;
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
 * @create:       2020/6/18 14:29
 */
@Controller
@RequestMapping("/wechat/record/")
public class WechatUsingRecordCtrl {

    @Resource
    private IWechatUsingRecordService wechatUsingRecordService;


    @GetMapping("/index")
    public String index() {
        return "/view/wechat/record/list";
    }

    @GetMapping("/list")
    @ResponseBody
    public ResponsePage<WechatUsingRecord> listUser(WechatUsingRecordQueryPage page) {
        return ResponsePage.newPage(wechatUsingRecordService.pageList(page));
    }

    @PostMapping("/add")
    @ResponseBody
    public void addPhone(@RequestBody WechatUsingRecordAlterParam param) {
        wechatUsingRecordService.add(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void deletePhone(@RequestBody DeleteBody body) {
        wechatUsingRecordService.delete(body.getId());
    }
}
