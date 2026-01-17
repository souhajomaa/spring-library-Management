package com.example.spring.Library.controller;

import com.example.spring.Library.entity.Auteur;
import com.example.spring.Library.entity.Livre;
import com.example.spring.Library.service.AuteurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/auteurs")
@RequiredArgsConstructor
public class AuteurController {

    private final AuteurService auteurService;

    @GetMapping
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @GetMapping("/{id}")
    public Auteur getAuteur(@PathVariable Long id) {
        return auteurService.getAuteurById(id);
    }

    @PostMapping
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurService.updateAuteur(auteur);
    }

    @PutMapping("/{id}")
    public Auteur updateAuteur(@PathVariable Long id, @RequestBody Auteur auteur) {
        auteur.setId(id);
        return auteurService.updateAuteur(auteur);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/{auteurId}/livres")
    public Livre addLivre(@PathVariable Long auteurId, @RequestBody Livre livre) {
        return auteurService.ajouterLivreAAuteur(auteurId, livre);
    }

}