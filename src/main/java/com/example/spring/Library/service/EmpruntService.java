package com.example.spring.Library.service;

import com.example.spring.Library.entity.Emprunt;
import com.example.spring.Library.entity.Livre;
import com.example.spring.Library.repository.EmpruntRepository;
import com.example.spring.Library.repository.LivreRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class EmpruntService implements EmpruntSv {

    private final EmpruntRepository empruntRepository;
    private final LivreRepository livreRepository;
    @Override
    public Emprunt getEmpruntById(Long id) {
        return empruntRepository.findById(id).orElse(null);
    }

    @Override
    public List<Emprunt> getAllEmprunts() {
        return empruntRepository.findAll();
    }

    @Override
    public Emprunt saveEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    @Override
    public Emprunt updateEmprunt(Emprunt emprunt) {
        return empruntRepository.save(emprunt);
    }

    @Override
    public void deleteEmprunt(Long id) {
        empruntRepository.deleteById(id);
    }
    @Transactional
    public Emprunt emprunterLivre(Long livreId, String nom, String email) {
        Livre livre = livreRepository.findById(livreId)
                .orElseThrow(() -> new RuntimeException("Livre non trouvé"));

//ajouter emprunt
        Emprunt emprunt = new Emprunt();
        emprunt.setLivre(livre);
        emprunt.setNomEmprunteur(nom);
        emprunt.setEmailEmprunteur(email);
        emprunt.setDateEmprunt(LocalDate.now());
        emprunt.setDateRetourPrevue(LocalDate.now().plusDays(14));
        emprunt.setRetourne(false);

        livreRepository.save(livre);

        return empruntRepository.save(emprunt);
    }

}
