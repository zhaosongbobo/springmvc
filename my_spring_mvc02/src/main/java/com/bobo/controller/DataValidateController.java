package com.bobo.controller;

import com.bobo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class DataValidateController {

    @RequestMapping("/testValidate")
    public String testValidate(@Valid User user, BindingResult bindingResult){
        System.out.println(user);
        System.out.println(bindingResult);
        if (bindingResult.hasErrors()){
            System.out.println("验证失败");
            return "add";
        }else {
            System.out.println("验证成功");
            return "success";
        }
    }

    @RequestMapping("add")
    public String add(Model model){
        model.addAttribute("user",new User(1,"zhangsan","女",12,null,"1234@qq.com"));
        return "add";
    }
}
