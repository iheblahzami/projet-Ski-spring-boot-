package com.example.demo.repositories;

import com.example.demo.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursRepository extends CrudRepository<Cours, Long> {

}