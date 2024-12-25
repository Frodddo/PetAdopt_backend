package org.example.petspringdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("org.example.petspringdemo.mapper")
public class PetspringdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetspringdemoApplication.class, args);
    }

}
