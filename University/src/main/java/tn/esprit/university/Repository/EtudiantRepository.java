package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.university.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
