package org.example.petspringdemo.service;

import org.example.petspringdemo.entity.AnncInfo;

import java.util.List;

public interface AnncService {

    int createAnnc(AnncInfo anncInfo);

    int deleteById(int id);

    int updateAnnc(AnncInfo anncInfo);

    AnncInfo getAnncById(int id);

    List<AnncInfo> searchAnnc(Integer id, String title, Integer createdBy);

    List<AnncInfo> getAll();

    List<AnncInfo> getActiveAnnc();
}
