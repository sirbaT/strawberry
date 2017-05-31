package com.strawberry.master.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 第一页
 * Created by yaguang.wang
 * on 2017/5/31.
 */
@Controller
@RequestMapping(value = "/one")
public class FirstPageController {

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String firstPage(ModelMap model) {
        model.addAttribute("name", "wyg");
        return "firstpage";
    }
}
