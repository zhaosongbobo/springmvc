package com.bobo.controller;

import com.bobo.model.User;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestBodyController {
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("请求体内容" + body);
        return "success";
    }

    @RequestMapping("/testRequestBodyJson")
    public String testRequestBodyJson(@RequestBody User user) {
        System.out.println("----------");
        System.out.println(user);
        return "success";
    }


    @RequestMapping("/testHttpEntity")
    public String testRequestBody(HttpEntity<String> httpEntity) {
        System.out.println(httpEntity);
        return "success";
    }
}
