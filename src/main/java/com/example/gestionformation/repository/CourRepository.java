package com.example.gestionformation.repository;

import com.example.gestionformation.entity.Cour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourRepository extends JpaRepository<Cour,Integer> {
}
