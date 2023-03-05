package com.example.demo.entities;



import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Entity
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMonitor;
    String nomM;
    String prenomM;

    LocalDate dateRecru ;

    @OneToMany
    Set<Cours> cours;
}
