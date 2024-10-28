package com.example.owner.dto.response;

import lombok.*;

@Builder
@Getter
public class UserResponse {
    private String name;
    private String surname;
    private String passportNumber;
}
