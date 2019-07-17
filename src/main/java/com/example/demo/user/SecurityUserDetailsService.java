package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

    @Autowired
    MemberRepositoy memberRepositoy;

    @Autowired
    PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepositoy.findById(username).get();
        return new SecurityUser(member);
    }

    public void securitySave(Member member) {
        member.setMemberPass(passwordEncoder.encode(member.getMemberPass()));
        member.setRole("ROLE_USER");
        memberRepositoy.save(member);
    }
}




