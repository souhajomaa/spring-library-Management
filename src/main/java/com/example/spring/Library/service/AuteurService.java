package com.example.spring.Library.service;

import com.example.spring.Library.entity.Auteur;
import com.example.spring.Library.entity.Livre;
import com.example.spring.Library.repository.AuteurRepository;
import com.example.spring.Library.repository.LivreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class AuteurService implements AuteurSv{
    private final AuteurRepository auteurRepository;
   private final LivreRepository livreRepository;
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

    @Transactional

    public Livre ajouterLivreAAuteur(Long id, Livre livre){
        Auteur auteur=auteurRepository.getAuteurById(id);
        livre.setAuteur(auteur);
        Livre livresave=livreRepository.save(livre);
        auteur.getLivres().add(livresave);
        auteurRepository.save(auteur);
        return livresave;
    }
}
