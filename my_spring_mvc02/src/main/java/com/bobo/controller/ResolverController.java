package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResolverController {
    @RequestMapping("/testMyView")
    public String testResolver(Model model) {
        model.addAttribute("msg", "波波");
        return "zsb:/success";
    }
}
