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
    public int updateAll(UserInfo user) {
        return userMapper.updateAll(user);
    }

    @Override
    public void insertUser(UserInfo userInfo)
    {
        userMapper.insertUser(userInfo);
    }

    @Override
    public boolean checkAccount(String account)
    {
        return  userMapper.checkAccount(account);
    }

    @Override
    public int verify(String account,String password)
    {
        return userMapper.verify(account,password);
    }

    @Override
    public List<UserInfo> getUserInfomationById(int userId) {
        return userMapper.getUserInfomationById(userId);
    }

    @Override
    public List<UserInfo> getUserInformation(String account,String password)
    {return userMapper.getUserInformation(account,password);};

    @Override
    public List<PetInfo> getAdoptedPetInformation(String account,String password)
    {
        return userMapper.getAdoptedPetInformation(account,password);
    }

    @Override
    public int deleteByUserId(int userId) {
        return userMapper.deleteByUserId(userId);
    }

    public List<UserInfo> getUserInfo(){
        return userMapper.getUserInfo();
    }
}
