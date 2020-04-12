package com.bobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class MessageSourceController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping("/locale")
    public String testMessageSource(Locale locale){
        System.out.println(locale);
        String username = messageSource.getMessage("username", null, locale);
        System.out.println(username);
        return "login";
    }
}
