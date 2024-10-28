package com.example.owner.dto.request;

import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
public class UserRequest {
    private String name;
    private String surname;
    private String passportNumber;
    private String city;
    private String birthday;
}
