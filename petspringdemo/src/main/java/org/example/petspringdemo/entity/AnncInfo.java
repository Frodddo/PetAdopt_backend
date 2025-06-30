package org.example.petspringdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class AnncInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer announcementId;
    private String title;
    private String content;
    private Integer createdBy;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Short isActive;

    public AnncInfo() {
        this.createdAt = LocalDateTime.now();
    }

}
