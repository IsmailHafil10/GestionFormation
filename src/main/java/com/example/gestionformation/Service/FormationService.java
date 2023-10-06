package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Formation;
import com.example.gestionformation.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService implements IFormationService {
    @Autowired
    FormationRepository formationRepository;

    public List<Formation> findAllFormations() {
        return formationRepository.findAll();
    }

    public Optional<Formation> findFormationById(int id) {
        return formationRepository.findById(id);
    }

    public Formation addFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    public Formation updateFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    public void removeFormation(int id) {
        formationRepository.deleteById(id);
    }
}
