package com.strawberry.master.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页连接器
 * Created by yaguang.wang
 * on 2017/5/15.
 */
@Controller
public class IndexPageController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String IndexPage() {
        return "index";
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "网站建设中";
        //return "root/index";
    }
}
