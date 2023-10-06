package com.example.gestionformation.repository;

import com.example.gestionformation.entity.RDV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RDVRepository extends JpaRepository<RDV,Integer> {
}
