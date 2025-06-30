package org.example.petspringdemo.service.impl;

import org.apache.ibatis.annotations.Param;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.PetUserDTO;
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
    public List<PetInfo> selectAllByStatus(Integer status) {
        return petMapper.selectAllByStatus(status);
    }

    @Override
    public void insertPet(PetInfo petInfo) {
        petMapper.insertPet(petInfo);
    }

    @Override
    public void updateStatusById(Integer petId, Integer updatedStatus) {
        petMapper.updateStatusById(petId,updatedStatus);
    }

    @Override
    public void updateAll(PetInfo pet) {
        petMapper.updateAll(pet);
    }

    @Override
    public List<PetUserDTO> selectUnhandledPet() {return petMapper.selectUnhandledPet();}

    @Override
    public PetInfo selectPetById(int petId) {return petMapper.selectPetById(petId);};

    @Override
    public List<PetInfo> selectAllByStatusAndBelonging(int status, int belonging){return petMapper.selectAllByStatusAndBelonging(status,belonging);};
}
