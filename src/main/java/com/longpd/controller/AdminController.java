package com.longpd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by hoang on 6/30/2017.
 */
@Controller
public class AdminController {

    @GetMapping("/admin")
    public String goAdminPage(Model model){

        return "admin";
    }
}
