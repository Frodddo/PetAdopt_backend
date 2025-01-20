package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.PageBean;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;

import java.util.List;

public interface UserService {
    void insertUser(UserInfo userInfo);

    boolean checkAccount(String account);

    int verify(String userName,String password);

    String getIdentity(String account);

    void updateAll(UserInfo user);

    void deleteById(Integer id);

    PageBean page(Integer pageNo, Integer pageSize, String account, String email, String phone);
}
