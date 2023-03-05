package com.example.demo.services;

import com.example.demo.entities.Cours;
import com.example.demo.repositories.CoursRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ICoursServiceImp implements ICoursService{
    @Autowired
    private CoursRepository coursRepository;


    @Override
    public List<Cours> retrieveAllCourses() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours retrieveCoursById(Long numCours) {
        return coursRepository.findById(numCours).orElse(null);
    }

    @Override
    public void removeCours(long id) {
        coursRepository.deleteById(id);


    }
}
