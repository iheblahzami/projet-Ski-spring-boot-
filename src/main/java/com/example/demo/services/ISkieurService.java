package com.example.demo.services;

import com.example.demo.entities.Moniteur;
import com.example.demo.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();

    Skieur updateSkieur(Skieur skieur);

    Skieur addSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieurById (Long numSkieur);
}
