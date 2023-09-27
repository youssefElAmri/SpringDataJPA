package com.esprit.springbootjpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;

    private boolean estValide;

    // Getters and setters
    // ...
}
