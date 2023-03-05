package com.example.demo.services;

import com.example.demo.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

    Moniteur retrieveMoniteurById(Long numMoniteur);

    void removeMoniteur(long id);
}
