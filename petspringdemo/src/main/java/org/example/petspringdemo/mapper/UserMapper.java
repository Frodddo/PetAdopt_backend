package org.example.petspringdemo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;

import java.util.List;

@Mapper
public interface UserMapper {

    void insertUser(UserInfo userInfo);

    boolean checkAccount(String account);

    int verify(String account,String password);

    void updateAll(UserInfo user);

    String getIdentity(String account);

    void deleteById(Integer id);

    List<UserInfo> page(String account, String email, String phone);

}
