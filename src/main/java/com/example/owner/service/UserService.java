package com.example.owner.service;

import com.example.owner.model.Passport;
import com.example.owner.model.User;

import java.util.UUID;

public interface UserService {

    /**
     * Поиск пользоватиеля по id
     * @param id - уник. иденификатор
     * @return пользователь
     */
    User findUserById(UUID id);

    /**
     * создание пользователя
     * @param user - пользователь
     * @param passport - пасспорт
     * @return - созданный пользователь
     */
    User createUser(User user, Passport passport);

    /**
     * удаление пользователя по id
     * @param id - уник. идентификатор
     */
    void deleteUser(UUID id);

}
