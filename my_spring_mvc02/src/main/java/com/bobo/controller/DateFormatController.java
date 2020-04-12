package com.bobo.controller;

import com.bobo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateFormatController {
    @RequestMapping("/testDateFormat")
    public String testDateFormat(User user) {
        System.out.println(user);
        return "success";
    }
}
