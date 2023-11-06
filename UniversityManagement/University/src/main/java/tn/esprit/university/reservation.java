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
public class reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date anneuniversitaire;
    private Boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}