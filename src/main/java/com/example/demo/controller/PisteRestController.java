package com.example.demo.controller;

import com.example.demo.entities.Piste;
import com.example.demo.services.IPisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PisteRestController {
    @Autowired//implementation de l interface IAbonnementService
    private IPisteService iPisteService;

    @PostMapping
    public void addPiste (@RequestBody Piste piste){
        iPisteService.addPiste(piste);
    }

    @PutMapping
    public Piste update(@RequestBody Piste piste){
        return iPisteService.updatePiste(piste);

    }
    @GetMapping
    public List<Piste> getAll(){
        return iPisteService.retrieveAllPistes() ;
    }

    @GetMapping("/{id}")
    public Piste getById(@PathVariable long id){
        return iPisteService.retrievePisteById(id) ;
    }

    @DeleteMapping("/{id}")
    public void removePiste(@PathVariable long id) {
        iPisteService.removePiste(id);

    }
}
