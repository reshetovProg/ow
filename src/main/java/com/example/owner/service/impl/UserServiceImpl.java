package com.example.owner.service.impl;

import com.example.owner.exception.NotFoundUserException;
import com.example.owner.model.Passport;
import com.example.owner.model.User;
import com.example.owner.repository.PassportRepository;
import com.example.owner.repository.UserRepository;
import com.example.owner.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PassportRepository passportRepository;

    @Override
    public User findUserById(UUID id) {
        return userRepository.findById(id)
                .orElseThrow(() ->
                        new NotFoundUserException("user with id: " + id + " not found")
                );
    }

    @Override
    public User createUser(User user, Passport passport) {

        passportRepository.save(passport);

        return userRepository.save(user);
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
