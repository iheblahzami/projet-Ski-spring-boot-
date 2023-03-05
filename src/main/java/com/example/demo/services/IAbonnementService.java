package com.example.demo.services;

import com.example.demo.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    void addAbonnement (Abonnement a);
    Abonnement updateAbonnement(Abonnement a);
    List<Abonnement> getAllAbonnements();
    Abonnement getAbonnementById(long id);
    void removeAbonnement(long id);
}
