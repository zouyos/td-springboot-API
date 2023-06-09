package com.greta.aventurierspringrest.models.dao;

import com.greta.aventurierspringrest.models.entities.TypeArme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeArmeRepository extends JpaRepository<TypeArme, Long> {
}