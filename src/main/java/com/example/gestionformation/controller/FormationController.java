package com.example.gestionformation.controller;

import com.example.gestionformation.Service.IFormateurService;
import com.example.gestionformation.Service.IFormationService;
import com.example.gestionformation.entity.Formateur;
import com.example.gestionformation.entity.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/formations")
public class FormationController {
    @Autowired
    IFormationService formationService;

   @Autowired
   IFormateurService formateurService;

    @GetMapping("")
    public ResponseEntity<List<Formation>> getAllFormations() {
        List<Formation> formations=formationService.findAllFormations();
       return   ResponseEntity.ok(formations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formation> getFormationById(@PathVariable("id") int id) {
        Optional<Formation> optFormation = formationService.findFormationById(id);

        return optFormation.map(formation -> ResponseEntity.ok(formation))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<Formation> addFormation(@RequestBody Formation nouvelleFormation) {
        Formation formation = formationService.addFormation(nouvelleFormation);

        if (formation != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(formation);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Formation> updateFormation(
            @PathVariable("id") int id,
            @RequestBody Formation formationMiseAJour) {
        Optional<Formation> formationExistante = formationService.findFormationById(id);

        if (formationExistante.isPresent()) {
            Formation formationExistanteValue = formationExistante.get();

            // Mettez à jour d'autres propriétés de la formationExistanteValue au besoin

            formationExistanteValue.setId(formationMiseAJour.getId());

            Formation formationMiseAJourResult = formationService.updateFormation(formationExistanteValue);
            return ResponseEntity.ok(formationMiseAJourResult);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PatchMapping("/{formationId}/affecterFormateur/{formateurId}")
    public ResponseEntity<Void> affecterFormateurToFormation(
            @PathVariable("formationId") int formationId,
            @PathVariable("formateurId") int formateurId) {
        Optional<Formation> formationExistante = formationService.findFormationById(formationId);
        Optional<Formateur> formateur = formateurService.findFormateurById(formateurId);

        if (formationExistante.isPresent() && formateur.isPresent()) {
            Formation formation = formationExistante.get();
            formation.setFormateur(formateur.get());
            formationService.updateFormation(formation); // Assurez-vous d'implémenter cette méthode

            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFormation(@PathVariable("id") int id) {
        Optional<Formation> formationExistante = formationService.findFormationById(id);

        if (formationExistante.isPresent()) {
            formationService.removeFormation(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
