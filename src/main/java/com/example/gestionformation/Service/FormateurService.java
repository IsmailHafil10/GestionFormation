package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Formateur;
import com.example.gestionformation.repository.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FormateurService implements IFormateurService{
    @Autowired
    FormateurRepository formateurRepository;

    public List<Formateur> findAllFormateurs() {
        return formateurRepository.findAll();
    }

    public Optional<Formateur> findFormateurById(int id) {
        return formateurRepository.findById(id);
    }

    public Formateur addFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public Formateur updateFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    public void removeFormateur(Formateur formateur) {
        formateurRepository.delete(formateur);
    }

}
