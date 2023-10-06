package com.example.gestionformation.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class Formateur extends Utilisateur {
    @JsonManagedReference
    @OneToMany(mappedBy = "formateur")
    private Set<Formation> formations;
}
