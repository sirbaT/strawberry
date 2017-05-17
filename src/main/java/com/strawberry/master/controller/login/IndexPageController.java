package com.strawberry.master.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页连接器
 * Created by yaguang.wang
 * on 2017/5/15.
 */
@Controller
public class IndexPageController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String IndexPage() {
        return "root/index";
    }

    @RequestMapping("/")
    public String index() {
        // return "Greetings from Spring Boot!";
        return "root/index";
    }
}
