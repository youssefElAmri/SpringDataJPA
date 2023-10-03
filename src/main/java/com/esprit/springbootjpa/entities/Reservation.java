package com.esprit.springbootjpa.entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="reservation")

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private String idReservation;


    @Column(name="anneeUniversitaire")
    private Date anneeUniversitaire;

    @Column(name="estValide")
    private boolean estValide;


@ManyToMany (mappedBy = "reservations" , cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
    // Getters and setters
    // ...
}
