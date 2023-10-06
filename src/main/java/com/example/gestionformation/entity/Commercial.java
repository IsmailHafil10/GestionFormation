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
public class Commercial extends Utilisateur{
    @OneToMany(mappedBy = "commercial")
    private Set<RDV> RDVs;

    @OneToMany(mappedBy = "commercial")
    private Set<Appels> Appels;
}
