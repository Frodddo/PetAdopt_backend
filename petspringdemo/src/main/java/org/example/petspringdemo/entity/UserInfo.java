package org.example.petspringdemo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    private String account;

    private String nickname;

    private String password;

    private String email;

    private String phone;

    private String identity;

    private LocalDateTime regTime;

    public UserInfo(LocalDateTime regTime) {
        this.regTime = LocalDateTime.now();
    }
}
