package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityUserContoller {
    @Autowired
    SecurityUserDetailsService securityUserDetailsService;

    @GetMapping("/signup")
    public String showSignUp() {
        return "signUp";
    }

    @PostMapping("/signup")
    public int signUp(@RequestBody Member member) {
        securityUserDetailsService.securitySave(member);
        System.out.println("회원가입 완료");
        return 200;
    }

}
