package com.example.shifty.services;

import com.example.shifty.exceptions.ResultNotFoundException;
import com.example.shifty.model.Schicht;
import com.example.shifty.repo.SchichtRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SchichtService {
    private final SchichtRepo schichtRepo;

    @Autowired
    public SchichtService(SchichtRepo schichtRepo) {
        this.schichtRepo = schichtRepo;
    }

    public Schicht addSchicht(Schicht schicht){return schichtRepo.save(schicht);}

    public List<Schicht> findAllSchichten(){return schichtRepo.findAll();}

    public Schicht updateSchicht(Schicht schicht){return schichtRepo.save(schicht);}

    public Schicht findSchichtById(Long id){
        return schichtRepo.findSchichtById(id).orElseThrow(()->new ResultNotFoundException("Schicht "+id+" nicht gefunden!"));
    }

    public void deleteSchicht(Long id){schichtRepo.deleteSchichtById(id);}
}
