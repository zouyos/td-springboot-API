package com.greta.aventurierspringrest.services;

import com.greta.aventurierspringrest.models.dao.ArmeRepository;
import com.greta.aventurierspringrest.models.entities.Arme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmeService {
    private ArmeRepository armeRepository;

    //Clique droit generate constructor, puis @Autowired pour dire d'injecter le repo dans le service
    @Autowired
    public ArmeService(ArmeRepository armeRepository) {
        this.armeRepository = armeRepository;
    }

    public List<Arme> index(){
        return armeRepository.findAll();
    }

    public List<Arme> searchArmeAventurierId(Long idAventurier){
        return armeRepository.findArmesByAventurier_Id(idAventurier);
    }
}
