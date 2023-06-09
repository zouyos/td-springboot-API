package com.greta.aventurierspringrest.models.dao;

import com.greta.aventurierspringrest.models.entities.Arme;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArmeRepository extends JpaRepository<Arme, Long> {
    public List<Arme> findArmesByAventurier_Id(Long idAventurier);
}