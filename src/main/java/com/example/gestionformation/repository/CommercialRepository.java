package com.example.gestionformation.repository;

import com.example.gestionformation.entity.Commercial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommercialRepository extends JpaRepository<Commercial,Integer> {
}
