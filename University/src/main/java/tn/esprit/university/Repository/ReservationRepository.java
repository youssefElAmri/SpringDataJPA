package tn.esprit.university.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.university.reservation;

import java.util.Date;

public interface ReservationRepository extends JpaRepository<reservation,Long> {
    reservation findByAnneuniversitaire(Date anu);
}
