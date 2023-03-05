package com.example.demo.repositories;

import com.example.demo.entities.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkieurRepository extends CrudRepository<Skieur, Long> {

}