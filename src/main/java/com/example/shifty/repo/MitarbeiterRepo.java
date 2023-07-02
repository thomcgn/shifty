package com.example.shifty.repo;

import com.example.shifty.model.Mitarbeiter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MitarbeiterRepo extends JpaRepository<Mitarbeiter, Long> {

    void deleteMitarbeiterById(Long id);

    Optional<Mitarbeiter> findMitarbeiterById(Long id);
}
