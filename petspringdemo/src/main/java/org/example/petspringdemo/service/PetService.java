package org.example.petspringdemo.service;

import org.apache.ibatis.annotations.Param;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.PetUserDTO;
import org.example.petspringdemo.entity.UserInfo;

import java.util.List;


public interface PetService {

    //查询
    List<PetInfo> selectAllPet();

    List<PetInfo> selectAllByStatus(Integer Status);

    void insertPet(PetInfo petInfo);

    void updateStatusById(Integer petId,Integer updated_status);

    void updateAll(PetInfo pet);

    List<PetUserDTO> selectUnhandledPet();

    PetInfo selectPetById(int petId);

    List<PetInfo> selectAllByStatusAndBelonging(int status, int belonging);

}
