package com.example.demo.controller;

import com.example.demo.entities.Abonnement;
import com.example.demo.services.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/abonnement")
public class AbonnementRestController {
    @Autowired//implementation de l interface IAbonnementService
    private IAbonnementService iabonnementService;

    @PostMapping
    public void add (@RequestBody Abonnement a){
        iabonnementService.addAbonnement(a);
    }

    @PutMapping
    public Abonnement update(@RequestBody Abonnement a){
        return iabonnementService.updateAbonnement(a);

    }
    @GetMapping
    public List<Abonnement> getAll(){
        return iabonnementService.getAllAbonnements() ;
    }

    @GetMapping("/{id}")
    public Abonnement getById(@PathVariable long id){
        return iabonnementService.getAbonnementById(id) ;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iabonnementService.removeAbonnement(id);

    }
}
