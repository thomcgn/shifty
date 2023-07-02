package com.example.shifty.controllers;

import com.example.shifty.model.Mitarbeiter;
import com.example.shifty.services.MitarbeiterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiterResource {
    private final MitarbeiterService mitarbeiterService;

    public MitarbeiterResource(MitarbeiterService mitarbeiterService) {
        this.mitarbeiterService = mitarbeiterService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Mitarbeiter>> getAllMitarbeiter(){
        List<Mitarbeiter> mitarbeiterList = mitarbeiterService.findAllMitarbeiter();
        return new ResponseEntity<>(mitarbeiterList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Mitarbeiter> getMitarbeiterById(@PathVariable("id") Long id){
        Mitarbeiter mitarbeiter = mitarbeiterService.findMitarbeiterById(id);
        return new ResponseEntity<>(mitarbeiter,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Mitarbeiter> addMitarbeiter(@RequestBody Mitarbeiter mitarbeiter){
        Mitarbeiter newMitarbeiter = mitarbeiterService.addMitarbeiter(mitarbeiter);
        return new ResponseEntity<>(newMitarbeiter,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Mitarbeiter> updateMitarbeiter(@RequestBody Mitarbeiter mitarbeiter){
        Mitarbeiter updatedMitarbeiter = mitarbeiterService.addMitarbeiter(mitarbeiter);
        return new ResponseEntity<>(updatedMitarbeiter,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMitarbeiter(@PathVariable("id") Long id){
        mitarbeiterService.deleteMitarbeiter(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
