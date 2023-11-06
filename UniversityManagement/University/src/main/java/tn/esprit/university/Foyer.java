package tn.esprit.university;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomFoyer;
    private long capacitFoyer;
    private boolean archived=false;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "foyers")
    private List<bloc> blocs;
    @OneToOne(mappedBy = "foyer")
    private universite university;
}