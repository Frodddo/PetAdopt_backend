package org.example.petspringdemo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.petspringdemo.entity.PetInfo;
import org.example.petspringdemo.entity.PetUserDTO;

import java.util.List;

@Mapper
public interface PetMapper {
    
    List<PetInfo> selectAllPet();

    List<PetInfo> selectAllByStatus(@Param("status") int status);

    void insertPet(PetInfo petInfo);

    void updateStatusById(@Param("pet_id") int pedId,@Param("updated_status") int status);

    void updateAll(PetInfo pet);

    List<PetUserDTO> selectUnhandledPet();

    PetInfo selectPetById(int petId);

    List<PetInfo> selectAllByStatusAndBelonging(int status, int belonging);
}
