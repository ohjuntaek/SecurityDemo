package com.example.demo.user;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
@Data
public class Member {
    @Id
    private String memberId;
    @Column(length = 60)
    private String memberPass;
    private String memberName;
    private String memberTel;
    private String memberAddress;
    private String gitlabUserName;
    private String role;
}
