package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Demo {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column
    String name;
}
