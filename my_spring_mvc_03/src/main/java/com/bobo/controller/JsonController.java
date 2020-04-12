package com.bobo.controller;

import com.bobo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class JsonController {
    @ResponseBody
    @RequestMapping("/testJsonData")
    public List<User> testJsonData() {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(1, "bobo", 21, "男", new Date(), "1234@qq.com"));
        userList.add(new User(2, "张三", 20, "女", new Date(), "1234@qq.com"));
        userList.add(new User(3, "李四", 22, "男", new Date(), "1234@qq.com"));
        return userList;
    }

    @ResponseBody
    @RequestMapping("/testResponseBody")
    public String testResponseBody(){
        return "<h1>success</h1>";
    }
}
