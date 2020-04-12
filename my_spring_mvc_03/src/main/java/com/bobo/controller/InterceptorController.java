package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println(this.getClass().getSimpleName()+" testInterceptor");
        return "success";
    }
}
