package com.bobo.controller;

import com.bobo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConverterController {
    @RequestMapping("testConverterUser")
    public String testConverter(User user, Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "success";
    }
}
