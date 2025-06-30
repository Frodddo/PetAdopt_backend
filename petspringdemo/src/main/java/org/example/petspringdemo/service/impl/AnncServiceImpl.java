package org.example.petspringdemo.service.impl;

import org.example.petspringdemo.entity.AnncInfo;
import org.example.petspringdemo.mapper.AnncMapper;
import org.example.petspringdemo.service.AnncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnncServiceImpl implements AnncService {

    @Autowired
    private AnncMapper anncMapper;

    @Override
    public int createAnnc(AnncInfo anncInfo) {
        if (anncInfo.getCreatedAt() == null) {
            anncInfo.setCreatedAt(LocalDateTime.now());
        }
        anncInfo.setIsActive((short)1);//默认激活

        return anncMapper.createAnnc(anncInfo);
    }

    @Override
    public int deleteById(int id) {
        return anncMapper.deleteById(id);
    }

    @Override
    public int updateAnnc(AnncInfo anncInfo) {
        anncInfo.setUpdatedAt(LocalDateTime.now());
        return anncMapper.updateAnnc(anncInfo);
    }

    @Override
    public AnncInfo getAnncById(int id) {
        return anncMapper.getAnncById(id);
    }

    @Override
    public List<AnncInfo> searchAnnc(Integer id, String title, Integer createdBy) {
        return anncMapper.searchAnnc(id, title, createdBy);
    }

    @Override
    public List<AnncInfo> getAll() {
        return anncMapper.getAll();
    }

    @Override
    public List<AnncInfo> getActiveAnnc() {
        return anncMapper.getActiveAnnc();
    }
}
