package com.longpd.controller;

import com.longpd.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by hoang on 7/5/2017.
 */

@Controller
public class SignInController {
    @Value("${htmlName.signin}")
    String signIn;
    @Value("${htmlName.signup}")
    String signUp;
    @Value("${htmlName.admin}")
    String homePage;

    @GetMapping("/sign-in")
    public String signIn() {
        return signIn;
    }

    @PostMapping("/homepage")
    public String getHomePage(Map<String, Object> model) {
//        model.put("title", this.message);
        return homePage;
    }

    @RequestMapping(value = "/sign-up", method = RequestMethod.GET)
    public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName(signUp);
        return modelAndView;
    }

    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
//        User userExists = userService.findUserByEmail(user.getEmail());
//        if (userExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a user registered with the email provided");
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.setViewName("registration");
//        } else {
//            userService.saveUser(user);
//            modelAndView.addObject("successMessage", "User has been registered successfully");
//            modelAndView.addObject("user", new User());
//            modelAndView.setViewName("registration");
//
//        }
        return modelAndView;
    }
}
