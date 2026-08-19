package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;

public class Memberform {
    private String email;
    private String password;

    public Memberform(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Member toEntity() {
        return new Member(null, email, password);
    }
}
