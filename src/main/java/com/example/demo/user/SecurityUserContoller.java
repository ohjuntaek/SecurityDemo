package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityUserContoller {
    @Autowired
    SecurityUserDetailsService securityUserDetailsService;


    @GetMapping("/signup")
    public String showSignUp() {
        return "signUp";
    }

    @PostMapping("signup")
    public String signUp(Member member) {
        securityUserDetailsService.securitySave(member);
        return "home";
    }

}
