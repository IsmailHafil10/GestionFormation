package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Formateur;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IFormateurService {
    public List<Formateur> findAllFormateurs();

    public Optional<Formateur> findFormateurById(int id);

    public Formateur addFormateur(Formateur formateur);

    public Formateur updateFormateur(Formateur formateur);

    public void removeFormateur(Formateur formateur);

}
