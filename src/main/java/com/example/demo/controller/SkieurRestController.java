package com.example.demo.controller;

import com.example.demo.entities.Skieur;
import com.example.demo.services.ISkieurService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/skieur")
public class SkieurRestController {
    @Autowired
    private final ISkieurService skieurService;
    @PostMapping("/add")
    Skieur addSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
    @PutMapping("/update")
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return skieurService.updateSkieur(skieur);

    }
    @GetMapping("/all")
    public List<Skieur> retrieveAllSkieurs(){
        return skieurService.retrieveAllSkieurs() ;
    }

    @GetMapping("/get/{id}")
    public Skieur getById(@PathVariable long id){
        return skieurService.retrieveSkieurById(id) ;
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable long id) {
        skieurService.removeSkieur(id);

    }

    @PutMapping("/{numSkieur}/{numPiste}")
    public Skieur assignSkieurToPiste(long numSkieur, long numPiste) {
        return ISkieurService.assignSkieurToPiste(numSkieur,numPiste);
    }


}
