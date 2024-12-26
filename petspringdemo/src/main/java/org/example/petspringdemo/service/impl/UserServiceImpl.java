package org.example.petspringdemo.service.impl;


import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;
import org.example.petspringdemo.mapper.UserMapper;
import org.example.petspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertUser(UserInfo userInfo)
    {
        userMapper.insertUser(userInfo);
    }

    @Override
    public boolean checkUserName(String userName)
    {
        return  userMapper.checkUserName(userName);
    }

    @Override
    public int verify(String userName,String password)
    {
        return userMapper.verify(userName,password);
    }

    @Override
    public String getIdentity(String username)
    {
        return userMapper.getIdentity(username);
    }


}
