package com.greta.aventurierspringrest.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Arme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type_arme_id")
    private TypeArme typeArme;

    @ManyToOne
    @JoinColumn(name = "qualite_id")
    private Qualite qualite;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "aventurier_id")
    private Aventurier aventurier;

    public Aventurier getAventurier() {
        return aventurier;
    }

    public void setAventurier(Aventurier aventurier) {
        this.aventurier = aventurier;
    }

    public Qualite getQualite() {
        return qualite;
    }

    public void setQualite(Qualite qualite) {
        this.qualite = qualite;
    }

    public TypeArme getTypeArme() {
        return typeArme;
    }

    public void setTypeArme(TypeArme typeArme) {
        this.typeArme = typeArme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
