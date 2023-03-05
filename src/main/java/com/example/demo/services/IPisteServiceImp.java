package com.example.demo.services;

import com.example.demo.entities.Piste;
import com.example.demo.repositories.PisteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IPisteServiceImp implements IPisteService{
    @Autowired
    private PisteRepository pisteRepository;
    @Override
    public List<Piste> retrieveAllPistes() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePisteById(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public void removePiste(long id) {
        pisteRepository.deleteById(id);

    }


}
