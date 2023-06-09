package com.greta.aventurierspringrest.models.dao;

import com.greta.aventurierspringrest.models.entities.Qualite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualiteRepository extends JpaRepository<Qualite, Long> {
}