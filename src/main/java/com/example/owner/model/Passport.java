package com.example.owner.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passport {

    @Id
    @Column(name="passport_number")
    String passportNumber;

    String city;
    Date birthday;
}
