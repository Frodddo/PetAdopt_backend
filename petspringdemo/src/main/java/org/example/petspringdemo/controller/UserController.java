package org.example.petspringdemo.controller;


import org.example.petspringdemo.entity.PageBean;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;
import org.example.petspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/insert/*")
    public void insert(UserInfo userInfo){
        userService.insertUser(userInfo);
    }

    @RequestMapping("/check/*")
    public boolean check(String account){
        //userService.checkUserName(username);
        return userService.checkAccount(account);
    }

    @RequestMapping("/verify/*")
    public int verify(String account,String password){
        return userService.verify(account,password);
    }


    @RequestMapping("/getIdentity/*")
    public String getIdentity(String account)
    {
        return userService.getIdentity(account);
    }

    //动态修改用户信息传递json
    @RequestMapping("/updateAllWithJson")
    public void updateAll(@RequestBody UserInfo user){
        userService.updateAll(user);
    }

    /**
     * 删除用户
     * @param id
     */
    @RequestMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
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
    @RequestMapping("/page")
    public PageBean page(@RequestParam(defaultValue = "1") Integer pageNo,
                         @RequestParam(defaultValue = "5") Integer pageSize,
                         String account, String email, String phone){
        PageBean pageBean = userService.page(pageNo, pageSize, account, email, phone);
        return pageBean;
    }

}
