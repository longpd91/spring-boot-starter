package com.longpd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by hoang on 6/29/2017.
 */

@Controller
public class HelloController {

    // inject via application.properties
//    @Value("${welcome.message}")
    private String message = "Hello World";

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        model.put("title", this.message);
        return "welcome";
    }


}
