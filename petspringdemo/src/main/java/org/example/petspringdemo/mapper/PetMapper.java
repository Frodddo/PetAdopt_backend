package org.example.petspringdemo.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.example.petspringdemo.entity.PetInfo;

import java.util.List;

@Mapper
public interface PetMapper {
    
    List<PetInfo> selectAllPet();

    List<PetInfo> selectAllByStatus1();

    void insertPet(PetInfo petInfo);




}
