package com.example.demo.controller;

import com.example.demo.entities.Cours;
import com.example.demo.services.ICoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cours")
public class CoursRestController {
    @Autowired//implementation de l interface IAbonnementService
    private ICoursService iCourService;

    @PostMapping
    public void add (@RequestBody Cours cours){ iCourService.addCours(cours);
    }

    @PutMapping
    public Cours update(@RequestBody Cours cours){
        return iCourService.updateCours(cours);

    }
    @GetMapping
    public List<Cours> getAll(){
        return iCourService.retrieveAllCourses() ;
    }

    @GetMapping("/{id}")
    public Cours getById(@PathVariable long id){
        return iCourService.retrieveCoursById(id) ;
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable long id) {
        iCourService.removeCours(id);

    }

}
