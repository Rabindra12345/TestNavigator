package com.test.EaseExam;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Table(name = "user")
public class User {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="username")
    private String username;

    @Column(name ="password")
    private String password ;

    @Column(name ="email")
    private String email;

    @Column(name ="phone")
    private String phone;

    @Column(name ="enabled")
    private boolean enabled = true;

    @Column(name ="profile_picture")
    private String profilePicture;



}
