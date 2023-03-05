package com.example.demo.services;

import com.example.demo.entities.*;
import com.example.demo.repositories.PisteRepository;
import com.example.demo.repositories.SkieurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ISkieurServiceImp implements ISkieurService{

    @Autowired //(t3awedh = new SkieurRepository ) creer instance automatique
   private   SkieurRepository skieurRepository  ;
    private final PisteRepository pisteRepository;

    @Override
    public List<Skieur> retrieveAllSkieurs() {

        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {

        return (Skieur) skieurRepository.save(skieur);
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        skieurRepository.save(skieur);
        return null;
    }

    @Override
    public void removeSkieur(Long numSkieur) {

        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieurById(Long numSkieur) {

        return skieurRepository.findById(numSkieur ).orElse(null); //getbyid
    }
    public   Skieur assignSkieurToPiste(long numSkieur, long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found ");
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"404 not found ");
        skieur.getPistes().add(piste);

        return skieurRepository.save(skieur);

    }



    Skieur addSkierAndAssignToCourse(Skieur skieur) {
        // Créer un nouvel abonnement pour le skieur
        Abonnement abonnement = new Abonnement();
        abonnement.setDateDebut(new Date());
        abonnement.setSkieur(skieur);
        // Enregistrer l'abonnement dans la base de données
        numAbon.save(abonnement);

        // Créer une nouvelle inscription pour le skieur
        Inscription inscription = new Inscription();
        inscription.setDateInscription(new Date());
        inscription.setSkieur(skieur);
        // Enregistrer l'inscription dans la base de données
        numInscription.save(inscription);

        // Affecter le skieur à un cours
        Cours cours = coursDao.findCoursDisponible();
        cours.getInscriptions();
        // Enregistrer le cours dans la base de données
        numCours.save(cours);
        return skieur;
    }


}
