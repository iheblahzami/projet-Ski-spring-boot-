package com.example.demo.services;

import com.example.demo.entities.Moniteur;
import com.example.demo.repositories.MoniteurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    private MoniteurRepository moniteurRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteurById(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }

    @Override
    public void removeMoniteur(long id) {
        moniteurRepository.deleteById(id);
    }
}
