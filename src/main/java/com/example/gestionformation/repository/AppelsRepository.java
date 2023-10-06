package com.example.gestionformation.repository;

import com.example.gestionformation.entity.Appels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppelsRepository extends JpaRepository<Appels,Integer> {
}
