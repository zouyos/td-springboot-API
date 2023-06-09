package com.greta.aventurierspringrest.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class TypeArme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String type;
    private int degatMin;
    private int degatMax;
    @JsonIgnore
    @OneToMany(mappedBy = "typeArme", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REFRESH}, orphanRemoval = true)
    private List<Arme> armes = new ArrayList<>();

    public List<Arme> getArmes() {
        return armes;
    }

    public void setArmes(List<Arme> armes) {
        this.armes = armes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDegatMin() {
        return degatMin;
    }

    public void setDegatMin(int degatMin) {
        this.degatMin = degatMin;
    }

    public int getDegatMax() {
        return degatMax;
    }

    public void setDegatMax(int degatMax) {
        this.degatMax = degatMax;
    }
}
