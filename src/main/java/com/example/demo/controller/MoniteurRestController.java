package com.example.demo.controller;

import com.example.demo.entities.Moniteur;
import com.example.demo.services.IMoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class MoniteurRestController {
    @Autowired//implementation de l interface IAbonnementService
    private IMoniteurService iMoniteurService;

    @PostMapping
    public void add (@RequestBody Moniteur moniteur){
        iMoniteurService.addMoniteur(moniteur);
    }

    @PutMapping
    public Moniteur update(@RequestBody Moniteur moniteur){
        return iMoniteurService.updateMoniteur(moniteur);

    }
    @GetMapping
    public List<Moniteur> getAll(){
        return iMoniteurService.retrieveAllMoniteurs() ;
    }

    @GetMapping("/{id}")
    public Moniteur getById(@PathVariable long numMoniteur){
        return iMoniteurService.retrieveMoniteurById(numMoniteur) ;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iMoniteurService.removeMoniteur(id);

    }
}
