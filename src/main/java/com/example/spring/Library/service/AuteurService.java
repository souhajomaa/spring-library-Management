package com.example.spring.Library.service;

import com.example.spring.Library.entity.Auteur;
import com.example.spring.Library.repository.AuteurRepository;

import java.util.List;

public class AuteurService implements AuteurSv{
    private AuteurRepository auteurRepository;

    @Override
    public Auteur getAuteurById(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }


    @Override
    public Auteur updateAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    @Override
    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }
}
