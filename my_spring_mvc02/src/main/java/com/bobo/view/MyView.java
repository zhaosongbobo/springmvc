package com.bobo.view;

import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class MyView implements View {
    public String getContentType() {
        return "text/html";
    }

    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("保存的对象是map："+map);
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().write("欢迎你");
    }
}
