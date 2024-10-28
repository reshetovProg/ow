package com.example.owner.service;

import com.example.owner.model.Home;
import com.example.owner.model.Passport;
import com.example.owner.model.User;

import java.util.UUID;

public interface HomeService {
    /**
     * Поиск дом по id
     * @param id - уник. иденификатор
     * @return дом
     */
    Home findHomeById(UUID id);

    /**
     * создание дома
     * @param home - дом
     * @return - созданный дом
     */
    Home createHome(Home home);

    /**
     * удаление дома по id
     * @param id - уник. идентификатор
     */
    void deleteHome(UUID id);
}
