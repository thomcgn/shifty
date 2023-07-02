package com.example.shifty.controllers;

import com.example.shifty.model.Schicht;
import com.example.shifty.services.SchichtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schichten")
public class SchichtResource {

    private final SchichtService schichtService;


    public SchichtResource(SchichtService schichtService) {
        this.schichtService = schichtService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Schicht>> getAllSchichten(){
        List<Schicht> schichtList = schichtService.findAllSchichten();
        return new ResponseEntity<>(schichtList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Schicht> getSchichtById(@PathVariable("id") Long id){
        Schicht Schicht = schichtService.findSchichtById(id);
        return new ResponseEntity<>(Schicht,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Schicht> addSchicht(@RequestBody Schicht Schicht){
        Schicht newSchicht = schichtService.addSchicht(Schicht);
        return new ResponseEntity<>(newSchicht,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Schicht> updateSchicht(@RequestBody Schicht Schicht){
        Schicht updatedSchicht = schichtService.addSchicht(Schicht);
        return new ResponseEntity<>(updatedSchicht,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSchicht(@PathVariable("id") Long id){
        schichtService.deleteSchicht(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
