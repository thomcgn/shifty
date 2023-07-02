package com.example.shifty.repo;

import com.example.shifty.model.Schicht;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchichtRepo extends JpaRepository<Schicht,Long> {

    void deleteSchichtById(Long id);

    Optional<Schicht> findSchichtById(Long id);
}
