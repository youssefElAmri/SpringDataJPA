package com.esprit.springbootjpa.entities;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idBloc")
    private long idBloc;

    @Column(name="nomBloc")
    private String nomBloc;

    @Column(name="capaciteBloc")
    private long capaciteBloc;

    @ManyToOne
     Foyer foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambres;
    // Getters and setters
    // ...
}
