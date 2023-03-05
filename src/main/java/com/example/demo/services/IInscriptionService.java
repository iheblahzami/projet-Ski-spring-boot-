package com.example.demo.services;

import com.example.demo.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    void addInscription (Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    List<Inscription> getAllInscriptions();
    Inscription getInscriptionById(long id);
    void removeInscription(long id);

}
