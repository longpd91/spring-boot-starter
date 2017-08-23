package com.longpd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by hoang on 6/29/2017.
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String home1(Map<String, Object> model) {
        model.put("title", "s56xsx");
        return "welcome";
    }

    @GetMapping("/adminlte")
    public String adminlte(Map<String, Object> model) {
        model.put("title", "s56xsx");
        return "demoadminlte";
    }

//    @GetMapping("/signin")
//    public String signin(Map<String, Object> model) {
//        model.put("title", "Sign in");
//        return "sign-in";
//    }
}
