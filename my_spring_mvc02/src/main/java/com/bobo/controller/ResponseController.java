package com.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
@Controller
public class ResponseController {
    @RequestMapping("/outPut1")
    public String outPut1(Model model){
        System.out.println("outPut1");
        model.addAttribute("msg","我是model，outPut1");
        return "success";
    }
    @RequestMapping("/outPut2")
    public String outPut2(ModelMap modelMap){
        System.out.println("outPut2");
        modelMap.addAttribute("msg","我是ModelAndView,outPut2");
        return "success";
    }

    @RequestMapping("/outPut3")
    public String outPut3(Map map){
        System.out.println("outPut3");
        map.put("msg","我是map，outPut3");
        return "success";
    }

    @RequestMapping("/outPut4")
    public ModelAndView outPut4(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("msg","我是ModelAndView");
        return modelAndView;
    }

    @RequestMapping("/outPut5")
    public String outPut5(Model model){
        model.addAttribute("msg","我是SessionAttribute");
        return "success";
    }
}
