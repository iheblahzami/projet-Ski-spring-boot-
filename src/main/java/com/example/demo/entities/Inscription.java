package com.example.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInscription;
    Integer numSemaine;

    @ManyToOne
    Cours cours;
    @ManyToOne
    Skieur skieur ;
    private Date dateInscription;

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setSkieur(Skieur skieur) {
        this.skieur = skieur;
    }

    public Skieur getSkieur() {
        return skieur;
    }
}
