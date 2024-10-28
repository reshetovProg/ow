package com.example.owner.service.impl;

import com.example.owner.exception.NotFoundUserException;
import com.example.owner.model.Home;
import com.example.owner.model.Passport;
import com.example.owner.model.User;
import com.example.owner.repository.HomeRepository;
import com.example.owner.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final HomeRepository homeRepository;

    @Override
    public Home findHomeById(UUID id) {
        return homeRepository.findById(id)
                .orElseThrow(() ->
                        new NotFoundUserException("user with id: " + id + " not found")
                );
    }

    @Override
    public Home createHome(Home home) {
        return homeRepository.save(home);
    }

    @Override
    public void deleteHome(UUID id) {
        homeRepository.deleteById(id);
    }
}
