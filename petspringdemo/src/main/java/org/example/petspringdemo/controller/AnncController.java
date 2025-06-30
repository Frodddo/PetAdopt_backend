package org.example.petspringdemo.controller;

import org.example.petspringdemo.entity.AnncInfo;
import org.example.petspringdemo.service.AnncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/announcement")
@CrossOrigin(origins = "*")
public class AnncController {

    @Autowired
    private AnncService anncService;

    @PostMapping("/create")
    public String createAnnc(@RequestBody AnncInfo anncInfo) {
        int result = anncService.createAnnc(anncInfo);
//        System.out.println(result);
        if (result == 1) {
            // 删除成功
            return "success";
        } else {
            // 未找到用户，删除失败
            return "fail";
        }
    }

    @DeleteMapping("/deleteById/{id}")
    public String  deleteById(@PathVariable int id) {
        int result = anncService.deleteById(id);
        if (result == 1) {
            // 删除成功
            return "success";
        } else {
            // 未找到用户，删除失败
            return "fail";
        }

    }

    @PutMapping("/updateAnnc")
    public String updateAnnc(@RequestBody AnncInfo anncInfo) {
        int result = anncService.updateAnnc(anncInfo);
//        System.out.println(result);
        if (result == 1) {
            // 删除成功
            return "success";
        } else {
            // 未找到用户，删除失败
            return "fail";
        }
    }

    @GetMapping("/getAll")
    public List<AnncInfo> getAll(){
        return anncService.getAll();
    }

    @GetMapping("/getAnncById/{id}")
    public AnncInfo getAnncById(@PathVariable int id) {
        return anncService.getAnncById(id);
    }

    @GetMapping("/searchAnnc")
    public List<AnncInfo> searchAnnc(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) Integer createdBy
    ) {
        return anncService.searchAnnc(id, title, createdBy);
    }

    @GetMapping("/getActiveAnnc")
    public List<AnncInfo> getActiveAnnc() {
        return anncService.getActiveAnnc();
    }

}
