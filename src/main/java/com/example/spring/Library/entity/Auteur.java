package com.example.spring.Library.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private int age;
    private String nationalite;

    @OneToMany(mappedBy = "auteur", cascade = CascadeType.ALL)
    private List<Livre> livres = new ArrayList<>();
}