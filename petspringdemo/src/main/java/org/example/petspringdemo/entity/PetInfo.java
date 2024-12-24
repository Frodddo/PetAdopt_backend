package org.example.petspringdemo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import  lombok.Data;

@Data
@Entity
public class PetInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String  name;

    private String  avatar;

    private String  species;

    private String  gender;

    private String  age;

    private String  lng;

    private String  lat;

    private String  description;
}
