package com.esprit.springbootjpa.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity

@Table(name="chambre")

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idChambre")

    private long idChambre;


    @Column(name="numeroChambre")
    private long numeroChambre;

    @Column(name="TypeChambre")
    private TypeChambre TypeChambre;

    @ManyToOne
    Bloc blocs;

    @OneToMany (cascade = CascadeType.ALL)
    private Set <Reservation> reservations;


    // Getters and setters
    // ...
}

