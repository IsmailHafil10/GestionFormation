package com.example.gestionformation.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomFormation;
    private long prix;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_formateur")
    private Formateur formateur;

    @OneToMany(mappedBy = "formation")
    private Set<Payement> payements;

    @OneToMany(mappedBy = "formation")
    private Set<Cour> cours;

    @ManyToMany(mappedBy = "formations")
    private Set<Participant> participants;

    private LocalDate dateDebut;
    private LocalDate dateFin;




}
