package org.example.petspringdemo.service.impl;

import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.mapper.PetMapper;
import org.example.petspringdemo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper petMapper;

    @Override
    public List<PetInfo> selectAllPet(){
        return petMapper.selectAllPet();
    }

    @Override
    public List<PetInfo> selectAllByStatus1() {
        return petMapper.selectAllByStatus1();
    }

    @Override
    public void insertPet(PetInfo petInfo) {
        petMapper.insertPet(petInfo);
    }
}
