package org.example.petspringdemo.service.impl;

import org.example.petspringdemo.entity.EncyInfo;
import org.example.petspringdemo.mapper.EncyMapper;
import org.example.petspringdemo.service.EncyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EncyServiceImpl implements EncyService {

    @Autowired
    private EncyMapper encyMapper;

    @Override
    public List<EncyInfo> getByName(String commonName) {
        return encyMapper.getByName(commonName);
    }
}
