package com.example.demo.repositories;

import com.example.demo.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionRepository extends CrudRepository<Inscription, Long> {
}