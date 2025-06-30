package org.example.petspringdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class PetUserDTO {

//    @Id
//    private Integer petuserId;
    private String petId;

    private Integer userId;

    private String name;

    private String avatar;

    private String account;

    private String kind;

    private String species;

    private String gender;

    private String age;

    private String description;
}
