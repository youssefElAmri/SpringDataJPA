package tn.esprit.university;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomEt;
    private String prenomEt;
    private long cin;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany(mappedBy = "etudiants",cascade = CascadeType.ALL)
    private Set<reservation> reservations;
}