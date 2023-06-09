package com.greta.aventurierspringrest.controllers;

import com.greta.aventurierspringrest.models.entities.Arme;
import com.greta.aventurierspringrest.services.ArmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Pareil que @Controller mais pour les API REST
@RestController
@CrossOrigin
public class ArmeController {
    private ArmeService armeService;

    @Autowired
    public ArmeController(ArmeService armeService) {
        this.armeService = armeService;
    }

    @GetMapping("/arme")
    public List<Arme> index() {
        return armeService.index();
    }

    @GetMapping("/arme/aventurier/{idAventurier}")
    public List<Arme> armesByIdAventurier(@PathVariable(name = "idAventurier") Long id){
        return armeService.searchArmeAventurierId(id);
    }
}
