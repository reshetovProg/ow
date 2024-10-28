package com.example.owner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    String street;
    String number;
}
