package com.example.shifty.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Mitarbeiter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String email;
    private Long stundenKontingent;
    private Long aktuelleStunden;


    public Mitarbeiter() {
    }

    public Mitarbeiter(Long id, String name, String email, Long stundenKontingent, Long aktuelleStunden) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.stundenKontingent = stundenKontingent;
        this.aktuelleStunden = aktuelleStunden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getStundenKontingent() {
        return stundenKontingent;
    }

    public void setStundenKontingent(Long stundenKontingent) {
        this.stundenKontingent = stundenKontingent;
    }

    public Long getAktuelleStunden() {
        return aktuelleStunden;
    }

    public void setAktuelleStunden(Long aktuelleStunden) {
        this.aktuelleStunden = aktuelleStunden;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", stundenKontingent=" + stundenKontingent +
                ", aktuelleStunden=" + aktuelleStunden +
                '}';
    }
}
