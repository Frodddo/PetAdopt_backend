package org.example.petspringdemo.controller;


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

    @RequestMapping("/getUserInformation/*")
    public List<UserInfo> getUserInformation(String account, String password) {
        return userService.getUserInformation(account, password);
    }

    @RequestMapping("/getAdoptedPetInformation/*")
    public List<PetInfo> getAdoptedPetInformation(String account, String password) {
        return userService.getAdoptedPetInformation(account, password);
    }

    @RequestMapping("/getUserInformation")
    public List<UserInfo> getUserInfo(){
        return userService.getUserInfo();
    }

    @DeleteMapping("/deleteByUserId/{userId}")
    public String deleteByUserId(@PathVariable int userId){
        int result = userService.deleteByUserId(userId); // 调用 MyBatis 删除方法
        if (result == 1) {
            // 删除成功
            return "success";
        } else {
            // 未找到用户，删除失败
            return "fail";
        }
    }

    @RequestMapping("/getUserInformationById/{userId}")
    public List<UserInfo> getUserInfomationById(@PathVariable int userId){
        return userService.getUserInfomationById(userId);
    }

    @PutMapping("/updateAllWithJson")
    public String updateAll(@RequestBody UserInfo user){
        int result = userService.updateAll(user);
        if (result == 1) {
            // 删除成功
            return "success";
        } else {
            // 未找到用户，删除失败
            return "fail";
        }

    }



}
