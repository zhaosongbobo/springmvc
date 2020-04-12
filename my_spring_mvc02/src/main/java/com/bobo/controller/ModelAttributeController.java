package com.bobo.controller;

import com.bobo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class ModelAttributeController {

    Object o1 = null;
    Object o2 = null;
    Object o3 = null;

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("u") User user, Model model) {
        System.out.println("testModelAttribute" + user);
        o3 = model;
        //可以看到所有的model都是同一个对象
        System.out.println(o1 == o3);
        //可以看到存储的user对象也是同一个
        System.out.println(o2 == user);
        return "success";
    }

    @ModelAttribute("u")
    public User MyModelAttribute(Model model) {
        o1 = model;
        User user = new User();
        user.setId(100);
        user.setName("bobo");
//        user.setPassword("123");
        user.setAge(12);
//        model.addAttribute("u", user);
        o2 = user;
        System.out.println("MyModelAttribute:" + user);
        return user;
    }
}

