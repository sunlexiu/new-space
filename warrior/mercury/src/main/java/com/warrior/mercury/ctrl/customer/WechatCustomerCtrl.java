package com.warrior.mercury.ctrl.customer;

import com.warrior.mercury.model.dto.WechatCustomer;
import com.warrior.mercury.model.param.DeleteBody;
import com.warrior.mercury.model.param.customer.WechatCustomerAlterParam;
import com.warrior.mercury.model.param.customer.WechatCustomerQueryPage;
import com.warrior.mercury.service.customer.IWechatCustomerService;
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
 * @create:       2020/6/18 17:31
 */
@Controller
@RequestMapping("/wechat/customer")
public class WechatCustomerCtrl {

    @Resource
    private IWechatCustomerService wechatCustomerService;

    @GetMapping("/index")
    public String index() {
        return "/view/customer/list";
    }


    @GetMapping("/list")
    @ResponseBody
    public List<WechatCustomer> pageList(WechatCustomerQueryPage page) {
        return wechatCustomerService.pageList(page);
    }


    @PostMapping("/add")
    @ResponseBody
    public void add(@RequestBody WechatCustomerAlterParam param) {
        wechatCustomerService.add(param);
    }


    @PostMapping("/update")
    @ResponseBody
    public void update(@RequestBody WechatCustomerAlterParam param) {
        wechatCustomerService.update(param);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public void delete(@RequestBody DeleteBody body) {
        wechatCustomerService.delete(body.getId());
    }

    @PostMapping("/operator")
    @ResponseBody
    public void adjustOperationWechat() {

    }

}
