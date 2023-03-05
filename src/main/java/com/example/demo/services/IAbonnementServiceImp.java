package com.example.demo.services;

import com.example.demo.entities.Abonnement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAbonnementServiceImp implements IAbonnementService{
    @Override
    public void addAbonnement(Abonnement a) {

    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        return null;
    }

    @Override
    public List<Abonnement> getAllAbonnements() {
        return null;
    }

    @Override
    public Abonnement getAbonnementById(long id) {
        return null;
    }

    @Override
    public void removeAbonnement(long id) {

    }
}
