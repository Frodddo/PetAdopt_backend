package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.UserInfo;

public interface UserService {
    void insertUser(UserInfo userInfo);

    boolean checkUserName(String userName);

    int verify(String userName,String password);

    String getIdentity(String username);
}
