package com.example.owner.controller;

import com.example.owner.dto.request.UserRequest;
import com.example.owner.dto.response.UserResponse;
import com.example.owner.exception.DublicatePKException;
import com.example.owner.model.Passport;
import com.example.owner.model.User;
import com.example.owner.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;
    private final ObjectMapper objectMapper;

    @GetMapping("{id}")
    public UserResponse getUser(@PathVariable UUID id){
        var user = userService.findUserById(id);
        return UserResponse.builder()
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@RequestBody UserRequest userRequest){

        var passport = Passport.builder()
                .city(userRequest.getCity())
                .birthday(objectMapper.convertValue(userRequest.getBirthday(), Date.class))
                .passportNumber(userRequest.getPassportNumber())
                .build();

        var user = User.builder()
                .name(userRequest.getName())
                .surname(userRequest.getSurname())
                .passport(passport)
                .build();

        User userResponse;

        try{
            userResponse = userService.createUser(user, passport);
        } catch(Exception ex){
            throw new DublicatePKException(passport.getPassportNumber() + " повторяется");
        }

        return UserResponse.builder()
                .name(userResponse.getName())
                .surname(userResponse.getSurname())
                .passportNumber(userResponse.getPassport().getPassportNumber())
                .build();
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable UUID id){
        userService.deleteUser(id);
    }
}
