package org.example.petspringdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class PetInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer petId;

    private LocalDateTime addTime;

    private String name;

    private String avatar;

    private String kind;

    private String species;

    private String gender;

    private String age;

    private String description;

    private String lng;

    private String lat;

    private String status;

    private Integer belonging;
}
