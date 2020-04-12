package com.bobo.resolver;

import com.bobo.view.MyView;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@Controller
public class MyViewResolver implements ViewResolver {

    private int order;

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if (viewName.startsWith("zsb:")) {
            return new MyView();
        } else {
            return null;
        }
    }
}
