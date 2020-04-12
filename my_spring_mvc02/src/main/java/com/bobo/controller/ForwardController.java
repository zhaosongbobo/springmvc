package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {

    @RequestMapping("/success")
    public String testForward(){
        System.out.println(0);
        return "success";
    }

    @RequestMapping("/forward01")
    public String testForward01(){
        System.out.println(1);
        return "redirect:/success";
    }

    @RequestMapping("/forward02")
    public String testForward02(){
        System.out.println(2);
        return "redirect:/forward01";
    }
}
