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
    private Long arbeitsstunden;
    private Long verdienstlimit;
    private Long verdienst;
    private Long umschlag;

    public Mitarbeiter() {
    }

    public Mitarbeiter(Long id, String name, String email, Long arbeitsstunden, Long verdienstlimit, Long verdienst, Long umschlag) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.arbeitsstunden = arbeitsstunden;
        this.verdienstlimit = verdienstlimit;
        this.verdienst = verdienst;
        this.umschlag = umschlag;
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

    public Long getArbeitsstunden() {
        return arbeitsstunden;
    }

    public void setArbeitsstunden(Long arbeitsstunden) {
        this.arbeitsstunden = arbeitsstunden;
    }

    public Long getVerdienstlimit() {
        return verdienstlimit;
    }

    public void setVerdienstlimit(Long verdienstlimit) {
        this.verdienstlimit = verdienstlimit;
    }

    public Long getVerdienst() {
        return verdienst;
    }

    public void setVerdienst(Long verdienst) {
        this.verdienst = verdienst;
    }

    public Long getUmschlag() {
        return umschlag;
    }

    public void setUmschlag(Long umschlag) {
        this.umschlag = umschlag;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", arbeitsstunden=" + arbeitsstunden +
                ", verdienstlimit=" + verdienstlimit +
                ", verdienst=" + verdienst +
                ", umschlag=" + umschlag +
                '}';
    }
}
