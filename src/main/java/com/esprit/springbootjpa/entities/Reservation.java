package com.esprit.springbootjpa.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="reservation")
public class Reservation {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReservation")
    private Long idReservation;

    @Getter
    @Column(name="anneeUniversitaire")
    private Date anneeUniversitaire;

    @Getter
    @Column(name="estValide")
    private boolean estValide;

    @Getter
    @ManyToMany(mappedBy = "reservations", cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

    @ManyToOne
    @JoinColumn(name = "idChambre")
    private Chambre chambre;

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

}
