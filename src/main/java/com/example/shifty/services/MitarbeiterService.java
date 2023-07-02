package com.example.shifty.services;

import com.example.shifty.exceptions.ResultNotFoundException;
import com.example.shifty.model.Mitarbeiter;
import com.example.shifty.repo.MitarbeiterRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MitarbeiterService {

    private final MitarbeiterRepo mitarbeiterRepo;

    @Autowired
    public MitarbeiterService(MitarbeiterRepo mitarbeiterRepo) {
        this.mitarbeiterRepo = mitarbeiterRepo;
    }

    public Mitarbeiter addMitarbeiter(Mitarbeiter mitarbeiter){
       return mitarbeiterRepo.save(mitarbeiter);
    }

    public List<Mitarbeiter> findAllMitarbeiter(){
        return mitarbeiterRepo.findAll();
    }

    public Mitarbeiter updateMitarbeiter(Mitarbeiter mitarbeiter){
        return mitarbeiterRepo.save(mitarbeiter);
    }

    public Mitarbeiter findMitarbeiterById(Long id){
        return mitarbeiterRepo.findMitarbeiterById(id).orElseThrow(()-> new ResultNotFoundException("Mitarbeiter" + id + " nicht gefunden!"));
    }

    public void deleteMitarbeiter(Long id){
        mitarbeiterRepo.deleteMitarbeiterById(id);
    }
}
