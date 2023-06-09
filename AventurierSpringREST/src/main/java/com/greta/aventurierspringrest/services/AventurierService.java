package com.greta.aventurierspringrest.services;

import com.greta.aventurierspringrest.models.dao.AventurierRepository;
import com.greta.aventurierspringrest.models.entities.Aventurier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AventurierService {
    private AventurierRepository aventurierRepository;

    @Autowired
    public AventurierService(AventurierRepository aventurierRepository) {
        this.aventurierRepository = aventurierRepository;
    }

    public List<Aventurier> index(){
    return aventurierRepository.findAll();
    }

    public Aventurier show(Long id){
    return aventurierRepository.findById(id).orElse(null);
    }

    public List<Aventurier> searchNom(String nom){
        return aventurierRepository.findAventuriersByNomContainingIgnoreCase(nom);
    }

    public Aventurier save(Aventurier aventurier){
    return aventurierRepository.save(aventurier);
    }

    public void delete(Long id){
    aventurierRepository.deleteById(id);
    }

}
