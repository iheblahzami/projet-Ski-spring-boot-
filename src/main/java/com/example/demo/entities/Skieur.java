package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSkieur;
    String nomS;
    String prenomS;

    LocalDate dateNaissance;
    String ville;
    @OneToOne
    Abonnement abonnement;
    @ManyToMany
    Set<Piste>pistes;
    @OneToMany(mappedBy = "skieur" , cascade = CascadeType.REMOVE)
    Set<Inscription>inscriptions;


}
