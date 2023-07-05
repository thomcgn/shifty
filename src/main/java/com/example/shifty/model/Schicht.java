package com.example.shifty.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Entity
public class Schicht implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String wochentag;
    @Temporal(TemporalType.DATE)
    private Date datum;

    @ManyToOne
    @JoinColumn(name = "frueh_schicht_id")
    private Mitarbeiter fruehSchicht;

    @ManyToOne
    @JoinColumn(name = "zwischen_schicht_id")
    private Mitarbeiter zwischenSchicht;
    @ManyToOne
    @JoinColumn(name = "spaet_schicht_id")
    private Mitarbeiter spaetSchicht;

    @Temporal(TemporalType.TIME)
    private Time startzeit;
    @Temporal(TemporalType.TIME)
    private Time endzeit;


    public Schicht() {
    }

    public Schicht(Long id, String wochentag, Date datum, Mitarbeiter fruehSchicht, Mitarbeiter zwischenSchicht, Mitarbeiter spaetSchicht, Time startzeit, Time endzeit) {
        this.id = id;
        this.wochentag = wochentag;
        this.datum = datum;
        this.fruehSchicht = fruehSchicht;
        this.zwischenSchicht = zwischenSchicht;
        this.spaetSchicht = spaetSchicht;
        this.startzeit = startzeit;
        this.endzeit = endzeit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWochentag() {
        return wochentag;
    }

    public void setWochentag(String wochentag) {
        this.wochentag = wochentag;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Mitarbeiter getFruehSchicht() {
        return fruehSchicht;
    }

    public void setFruehSchicht(Mitarbeiter fruehSchicht) {
        this.fruehSchicht = fruehSchicht;
    }

    public Mitarbeiter getZwischenSchicht() {
        return zwischenSchicht;
    }

    public void setZwischenSchicht(Mitarbeiter zwischenSchicht) {
        this.zwischenSchicht = zwischenSchicht;
    }

    public Mitarbeiter getSpaetSchicht() {
        return spaetSchicht;
    }

    public void setSpaetSchicht(Mitarbeiter spaetSchicht) {
        this.spaetSchicht = spaetSchicht;
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

    @Override
    public String toString() {
        return "Schicht{" +
                "id=" + id +
                ", wochentag='" + wochentag + '\'' +
                ", datum=" + datum +
                ", fruehSchicht=" + fruehSchicht +
                ", zwischenSchicht=" + zwischenSchicht +
                ", spaetSchicht=" + spaetSchicht +
                ", startzeit=" + startzeit +
                ", endzeit=" + endzeit +
                '}';
    }
}
