package com.esprit.springbootjpa.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
@Table(name = "chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private long idChambre;

    @Column(name = "numeroChambre")
    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    @Column(name = "TypeChambre")
    private TypeChambre typeChambre;

    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @Getter
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chambre")
    private Set<Reservation> reservations;

    public Long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(Long idChambre) {
        this.idChambre = idChambre;
    }

    public int getNumeroChambre() {
        return Math.toIntExact(numeroChambre);
    }

    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
