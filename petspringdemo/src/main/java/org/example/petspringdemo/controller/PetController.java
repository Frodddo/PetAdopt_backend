package org.example.petspringdemo.controller;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
@CrossOrigin(origins = "*")
public class PetController {

    @Autowired
    private PetService petService;

    /*查询*/
    //1.展示所有动物信息
    @RequestMapping("/all")
    public List<PetInfo> selectAllPet()
    {
        return petService.selectAllPet();
    }

    //2.查询指定状态位的信息
    @RequestMapping("/selectAllByStatus/{status}")
    public List<PetInfo> selectAllByStatus(@PathVariable Integer status){
        return petService.selectAllByStatus(status);
    }

    //3.根据名字

    /*插入*/
    //1.新建动物信息
    @RequestMapping("/insert/*")
    public void insert(PetInfo petInfo){
        petService.insertPet(petInfo);
    }

    /*修改*/
    //1.修改状态位 传入修改之后的状态
    @RequestMapping("/approve/{petId}/{after_status}")
    public void updateStatusById(@PathVariable Integer petId,@PathVariable Integer after_status){
        petService.updateStatusById(petId,after_status);
    }

    //2.动态修改动物信息传递json
    @RequestMapping("/updateAllWithJson")
    public void updateAll(@RequestBody PetInfo pet){
        petService.updateAll(pet);
    }











}
