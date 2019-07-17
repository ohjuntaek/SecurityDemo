package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepositoy extends JpaRepository<Member, String> {
}
