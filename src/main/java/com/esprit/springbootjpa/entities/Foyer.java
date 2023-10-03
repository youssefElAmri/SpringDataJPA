package com.esprit.springbootjpa.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="Foyer")
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private long idFoyer;

    @Column(name="nomFoyer")
    private String nomFoyer;

    @Column(name="capaciteFoyer")
    private long capaciteFoyer;

    @OneToOne(mappedBy = "Foyer ")
    private Foyer Foyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> Blocs;



}
