package com.example.spring.Library.service;

import com.example.spring.Library.entity.Auteur;

import java.util.List;

public interface AuteurSv {
    Auteur getAuteurById(Long id);
    List<Auteur> getAllAuteurs();
    Auteur updateAuteur(Auteur auteur);
    void deleteAuteur(Long id);

}
