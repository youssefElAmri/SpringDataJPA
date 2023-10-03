package com.esprit.springbootjpa.entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEtudiant")
    private long idEtudiant;


    @Column(name="nomET")
    private String nomET;


    @Column(name="prenomET")
    private String prenomET;


    @Column(name="cin")
    private long cin;


    @Column(name="ecole")
    private String ecole;

    @Column(name="dateNaissance")
    private Date dateNaissance;

    @ManyToMany (cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
    // Getters and setters
    // ...
}
