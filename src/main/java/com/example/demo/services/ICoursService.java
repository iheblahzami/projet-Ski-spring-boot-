package com.example.demo.services;

import com.example.demo.entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCoursById (Long numCours);

    void removeCours(long id);
}
