package com.example.gestionformation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participant extends Utilisateur{
    @OneToMany(mappedBy = "participant")
    private List<Payement> payements;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "participant_formation",
            joinColumns = @JoinColumn(name = "participant_id"),
            inverseJoinColumns = @JoinColumn(name = "formation_id"))
    private Set<Formation> formations;
}
