package com.example.owner.repository;

import com.example.owner.model.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, String> {
}
