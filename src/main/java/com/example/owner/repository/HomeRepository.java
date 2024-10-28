package com.example.owner.repository;

import com.example.owner.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HomeRepository extends JpaRepository<Home, UUID> {
}
