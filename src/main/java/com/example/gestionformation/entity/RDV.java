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
public class RDV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_prospect")
    private Prospect prospect;

    @ManyToOne
    @JoinColumn(name = "id_commercial")
    private Commercial commercial;

    private String commentaire;

    private LocalDate dateRDV;

}
