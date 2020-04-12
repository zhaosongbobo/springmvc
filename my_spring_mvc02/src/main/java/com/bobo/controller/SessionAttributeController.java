package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("msg")
@Controller
public class SessionAttributeController {
    @RequestMapping("testSessionAttribute")
    public String testSessionAttribute(Model model){
        model.addAttribute("msg","我是sessionAttribute");
        return "success";
    }
}
