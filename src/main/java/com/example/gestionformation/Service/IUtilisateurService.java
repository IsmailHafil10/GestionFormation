package com.example.gestionformation.Service;

import com.example.gestionformation.entity.Utilisateur;

import java.util.List;
import java.util.Optional;

public interface IUtilisateurService {
    public List<Utilisateur> findAllUtilisateur();
    public Utilisateur findUtilisateurByUsername(String username);
    public Utilisateur addUtilisateur(Utilisateur utilisateur);
    public Utilisateur updateUtilisateur(Utilisateur utilisateur);
    public void removeUtilisateur(Utilisateur utilisateur);
}
