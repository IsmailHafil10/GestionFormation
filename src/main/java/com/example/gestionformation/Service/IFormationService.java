package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Formation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IFormationService {
    public List<Formation> findAllFormations();

    public Optional<Formation> findFormationById(int id);

    public Formation addFormation(Formation formation);

    public Formation updateFormation(Formation formation);

    public void removeFormation(int id);
}
