package com.greta.aventurierspringrest.controllers;

import com.greta.aventurierspringrest.models.entities.Aventurier;
import com.greta.aventurierspringrest.services.AventurierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Pour autoriser les requêtes qui viennent d'un autre port que 8080
@CrossOrigin
@RestController
public class AventurierController {

    private AventurierService aventurierService;

    @Autowired
    public AventurierController(AventurierService aventurierService) {
        this.aventurierService = aventurierService;
    }

    @GetMapping("/aventurier")
    public List<Aventurier> index(){
    return aventurierService.index();
    }

    @GetMapping("/aventurier/{id}")
    public Aventurier show(@PathVariable(name = "id") Long id){
        return aventurierService.show(id);
    }

    @GetMapping("/aventurier/nom/{nom}")
    public List<Aventurier> rechercheNom(@PathVariable(name = "nom") String nom){
        return aventurierService.searchNom(nom);
    }

    @PostMapping("/aventurier")
    public Aventurier add(@RequestBody Aventurier aventurier){
        return aventurierService.save(aventurier);
    }

    //La méthode Put s'utilise surtout pour les API REST (et écrase les données contrairement à un Patch)
    @PutMapping("/aventurier")
    public Aventurier update(@RequestBody Aventurier aventurier){ return aventurierService.save(aventurier); }

    //La méthode Delete s'utilise surtout pour les API REST (sinon POST pour les applications normales)
    @DeleteMapping("/aventurier/{id}")
    public void delete(@PathVariable(name="id") Long id){
     aventurierService.delete(id);
    }
}
