package com.example.gestionformation.repository;

import com.example.gestionformation.entity.Personne;
import com.example.gestionformation.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
    public Utilisateur findByUsername(String username);
}
