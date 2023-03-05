package com.example.demo.controller;

import com.example.demo.entities.Inscription;
import com.example.demo.services.IInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/inscription")
public class InscriptionRestController {
    @Autowired
    private IInscriptionService iInscriptionService ;

    @PostMapping
    public void addInscription (@RequestBody Inscription inscription){
        iInscriptionService.addInscription(inscription);
    }

    @PutMapping
    public Inscription update(@RequestBody Inscription inscription){
        return iInscriptionService.updateInscription(inscription);

    }
    @GetMapping
    public List<Inscription> getAllInscriptions(){
        return iInscriptionService.getAllInscriptions() ;
    }

    @GetMapping("/{id}")
    public Inscription getInscriptionById(@PathVariable long id){
        return iInscriptionService.getInscriptionById(id) ;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iInscriptionService.removeInscription(id);

    }
}
