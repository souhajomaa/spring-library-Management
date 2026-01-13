package com.example.spring.Library.entity;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private String isbn;
    private int nombrePages;
    private boolean disponible;


    @ManyToOne
    private Auteur auteur;

    @OneToMany(mappedBy = "livre", cascade = CascadeType.ALL)
    private List<Emprunt> emprunts = new ArrayList<>();
}