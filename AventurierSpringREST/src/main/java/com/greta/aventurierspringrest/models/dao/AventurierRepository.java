package com.greta.aventurierspringrest.models.dao;

import com.greta.aventurierspringrest.models.entities.Arme;
import com.greta.aventurierspringrest.models.entities.Aventurier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AventurierRepository extends JpaRepository<Aventurier, Long> {
    //On crée une méthode avec une signature spécifique (s'aider de l'auto-complétion) et Spring va la créer
    //Containing pour faire un select [...] where nom like 'search', et IgnoreCase pour ignorer la casse des lettres
    public List<Aventurier> findAventuriersByNomContainingIgnoreCase(String nom);

//    //Exemple pour filtres search bar
//    public Aventurier findAventurierByArmeAAndAtqOrderByNom(Arme arme, int atq);
//
//    //Autre méthode (nativeQuery = false : par défaut)
//    @Query(value = "select a from Aventurier a where a.nom like %?1%", nativeQuery = false)
//    public List<Aventurier> testSearch(String nom);
}