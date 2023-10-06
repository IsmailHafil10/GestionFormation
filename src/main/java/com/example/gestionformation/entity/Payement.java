package com.example.gestionformation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_participant")
    private Participant participant;

    @ManyToOne
    @JoinColumn(name = "id_formation")
    private Formation formation;
    private LocalDate datePayement;
    private Long montant;
}
