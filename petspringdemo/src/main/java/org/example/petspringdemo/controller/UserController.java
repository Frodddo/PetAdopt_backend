package org.example.petspringdemo.controller;


import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.UserInfo;
import org.example.petspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public boolean check(String username){
        //userService.checkUserName(username);
        return userService.checkUserName(username);
    }

    @RequestMapping("/verify/*")
    public int verify(String username,String password){
        return userService.verify(username,password);
    }
    @RequestMapping("/getIdentity/*")
    public String getIdentity(String username)
    {
        return userService.getIdentity(username);
    }
}
