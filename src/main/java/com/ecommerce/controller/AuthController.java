package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import com.ecommerce.entity.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController{
    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
}