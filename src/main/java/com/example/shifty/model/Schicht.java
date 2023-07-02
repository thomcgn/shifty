package com.example.shifty.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Time;

@Entity
public class Schicht implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String typ;
    private Time startzeit;
    private Time endzeit;
    private Long stunden;

    public Schicht(){}

    public Schicht(Long id, String typ, Time startzeit, Time endzeit, Long stunden) {
        this.id = id;
        this.typ = typ;
        this.startzeit = startzeit;
        this.endzeit = endzeit;
        this.stunden = stunden;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Time getStartzeit() {
        return startzeit;
    }

    public void setStartzeit(Time startzeit) {
        this.startzeit = startzeit;
    }

    public Time getEndzeit() {
        return endzeit;
    }

    public void setEndzeit(Time endzeit) {
        this.endzeit = endzeit;
    }

    public Long getStunden() {
        return stunden;
    }

    public void setStunden(Long stunden) {
        this.stunden = stunden;
    }

    @Override
    public String toString() {
        return "Schicht{" +
                "id=" + id +
                ", typ='" + typ + '\'' +
                ", startzeit=" + startzeit +
                ", endzeit=" + endzeit +
                ", stunden=" + stunden +
                '}';
    }
}
