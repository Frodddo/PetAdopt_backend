package org.example.petspringdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.petspringdemo.entity.EncyInfo;

import java.util.List;

@Mapper
public interface EncyMapper {
    List<EncyInfo> getByName(String commonName);
}
