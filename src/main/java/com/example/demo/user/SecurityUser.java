package com.example.demo.user;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User {
    public SecurityUser(Member member) {
        super(member.getMemberId(), member.getMemberPass(), AuthorityUtils.createAuthorityList(member.getRole()));
    }
}
