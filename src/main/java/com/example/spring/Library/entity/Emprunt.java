package com.example.spring.Library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomEmprunteur;
    private String emailEmprunteur;
    private LocalDate dateEmprunt;
    private LocalDate dateRetourPrevue;
    private LocalDate dateRetourEffective;
    private boolean retourne = false;

    @ManyToOne
    private Livre livre;
}