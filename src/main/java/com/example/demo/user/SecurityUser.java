package com.example.demo.user;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public class SecurityUser extends User {
    public SecurityUser(String username, String password, List role) {
        super(username, password, role);
    }
}
