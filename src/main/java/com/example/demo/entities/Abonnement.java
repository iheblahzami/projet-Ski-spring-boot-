package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Abonnement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numAbon;
    Date dateDebut;
    LocalDate dateFin;
    Float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;
    private Skieur skieur;

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setSkieur(Skieur skieur) {
        this.skieur = skieur;
    }

    public Skieur getSkieur() {
        return skieur;
    }
}
