package com.example.owner.controller;

import com.example.owner.dto.request.UserRequest;
import com.example.owner.dto.response.UserResponse;
import com.example.owner.exception.DublicatePKException;
import com.example.owner.model.Home;
import com.example.owner.model.Passport;
import com.example.owner.model.User;
import com.example.owner.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/homes")
public class HomeController {

    private final HomeService homeService;

    @GetMapping("{id}")
    public Home getHome(@PathVariable UUID id){
        return homeService.findHomeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Home createHome(@RequestBody Home home){
        return homeService.createHome(home);
    }

    @DeleteMapping("{id}")
    public void deleteHome(@PathVariable UUID id){
        homeService.deleteHome(id);
    }
}
