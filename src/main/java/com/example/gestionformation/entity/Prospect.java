package com.example.gestionformation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prospect extends Personne{

    @OneToMany(mappedBy = "prospect")
    private Set<RDV> RDVs;

    @OneToMany(mappedBy = "prospect")
    private Set<Appels> Appels;


}
