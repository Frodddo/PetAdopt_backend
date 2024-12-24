package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.PetInfo;

import java.util.List;


public interface PetService {

    List<PetInfo> selectAllPet();
    void insertPet(PetInfo petInfo);
}
