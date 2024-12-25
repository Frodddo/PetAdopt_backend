package org.example.petspringdemo.controller;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
@CrossOrigin(origins = "*")
public class PetController {

    @Autowired
    private PetService petService;

    //展示所有动物信息
    @RequestMapping("/all")
    public List<PetInfo> selectAllPet()
    {
        return petService.selectAllPet();
    }

    @RequestMapping("/insert/*")
    public void insert(PetInfo petInfo){
        petService.insertPet(petInfo);
    }


}
