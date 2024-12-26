package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.PetInfo;

import java.util.List;


public interface PetService {

    //查询
    List<PetInfo> selectAllPet();

    List<PetInfo> selectAllByStatus(Integer Status);

    void insertPet(PetInfo petInfo);

    void updateStatusById(Integer petId,Integer updated_status);




}
