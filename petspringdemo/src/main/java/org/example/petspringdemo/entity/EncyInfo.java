package org.example.petspringdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncyInfo {
        private Integer id;
        private LocalDate addTime = LocalDate.now();
        private String commonName;
        private String scientificName;
        private String family;
        private String description;
        private String habitat;
        private String diet;
        private String lifespan;
        private String careTips;
        private String imageUrl;
}
