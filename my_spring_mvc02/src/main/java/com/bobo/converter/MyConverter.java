package com.bobo.converter;

import com.bobo.model.User;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MyConverter implements Converter<String, User> {
    public User convert(String s) {
        System.out.println("--------");
        User user = null;
        if (s != null && s.split("-").length == 4) {
            user = new User();
            String[] textArray = s.split("-");
            user.setId(Integer.valueOf(textArray[0]));
            user.setName(textArray[1]);
//            user.(textArray[2]);
            user.setAge(Integer.valueOf(textArray[3]));
        }
        return user;
    }
}
