package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.EncyInfo;

import java.util.List;

public interface EncyService {
    List<EncyInfo> getByName(String commonName);
}
