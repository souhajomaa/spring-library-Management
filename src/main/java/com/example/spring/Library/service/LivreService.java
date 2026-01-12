package com.example.spring.Library.service;

import com.example.spring.Library.entity.Livre;
import com.example.spring.Library.repository.LivreRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LivreService implements LivreSv {

    private LivreRepository livreRepository;

    @Override
    public Livre getLivreById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    @Override
    public Livre saveLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public Livre updateLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    @Override
    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }
}
