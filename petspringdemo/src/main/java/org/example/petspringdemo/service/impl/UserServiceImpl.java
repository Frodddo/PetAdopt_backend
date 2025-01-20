package org.example.petspringdemo.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.example.petspringdemo.entity.PageBean;
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
    public String getIdentity(String account)
    {
        return userMapper.getIdentity(account);
    }

    @Override
    public void updateAll(UserInfo user) {
        userMapper.updateAll(user);
    }

    /**
     * 删除用户
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @param account
     * @param email
     * @param phone
     * @return
     */
    @Override
    public PageBean page(Integer pageNo, Integer pageSize, String account, String email, String phone) {
        // 分页参数
        PageHelper.startPage(pageNo, pageSize);
        // 查询
        List<UserInfo> userList = userMapper.page(account, email, phone);
        Page<UserInfo> page = (Page<UserInfo>)userList;

        // 封装PageBean对象
        PageBean pageBean = new PageBean(page.getTotal(), page.getResult());

        return pageBean;
    }


}
