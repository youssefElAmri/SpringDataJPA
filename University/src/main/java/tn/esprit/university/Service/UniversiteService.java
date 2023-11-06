package tn.esprit.university.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.university.Repository.UniversiteRepository;
import tn.esprit.university.universite;

import java.util.List;

@Service
@AllArgsConstructor

public class UniversiteService implements IUniversiteService{
    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public List<universite> retrieveAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public universite addUniversity(universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public universite updateUniversity(universite u,Long id) {
        if (universiteRepository.existsById(id)){
            u.setId(id);
            return universiteRepository.save(u);
        }else {
            return null;
        }

    }

    @Override
    public universite retrieveUniversity(long idUniversity) {
        return universiteRepository.findById(idUniversity).get();
    }

    @Override
    public void removeUniversity(long idUniversity) {
        universiteRepository.deleteById(idUniversity);
    }
}
