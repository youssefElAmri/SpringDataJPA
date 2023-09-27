package com.esprit.springbootjpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;

    private String nomET;

    private String prenomET;

    private long cin;

    private String ecole;

    private Date dateNaissance;

    // Getters and setters
    // ...
}
