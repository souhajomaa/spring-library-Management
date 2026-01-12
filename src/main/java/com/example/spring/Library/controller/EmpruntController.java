package com.example.spring.Library.controller;

import com.example.spring.Library.entity.Emprunt;
import com.example.spring.Library.service.EmpruntService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/emprunts")
@RequiredArgsConstructor
public class EmpruntController {

    private final EmpruntService empruntService;

    @GetMapping
    public List<Emprunt> getAllEmprunts() {
        return empruntService.getAllEmprunts();
    }

    @GetMapping("/{id}")
    public Emprunt getEmprunt(@PathVariable Long id) {
        return empruntService.getEmpruntById(id);
    }

    // POST créer un emprunt
    @PostMapping
    public Emprunt createEmprunt(@RequestBody Emprunt emprunt) {
        return empruntService.saveEmprunt(emprunt);
    }

    @PutMapping("/{id}")
    public Emprunt updateEmprunt(@PathVariable Long id, @RequestBody Emprunt emprunt) {
        emprunt.setId(id);
        return empruntService.updateEmprunt(emprunt);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmprunt(@PathVariable Long id) {
        empruntService.deleteEmprunt(id);
        return ResponseEntity.noContent().build();
    }
}