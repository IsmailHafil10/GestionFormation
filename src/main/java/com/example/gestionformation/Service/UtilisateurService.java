package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Utilisateur;
import com.example.gestionformation.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UtilisateurService implements  IUtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    public Utilisateur findUtilisateurByUsername(String username) {
        return utilisateurRepository.findByUsername(username);
    }

    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public void removeUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);
    }
}
