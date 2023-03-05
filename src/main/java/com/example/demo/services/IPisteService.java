package com.example.demo.services;

import com.example.demo.entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePisteById (Long numPiste);

    void removePiste(long id);


}
