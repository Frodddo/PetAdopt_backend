package org.example.petspringdemo.controller;

import org.example.petspringdemo.entity.EncyInfo;
import org.example.petspringdemo.service.EncyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ency")
@CrossOrigin(origins = "*")
public class EncyController {

    @Autowired
    private EncyService encyService;

    @GetMapping("/getByName/{commonName}")
    public List<EncyInfo> getByName(@PathVariable String commonName) {
        List<EncyInfo> list = encyService.getByName(commonName);
        return list;
    }

}
