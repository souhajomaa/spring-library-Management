package com.example.spring.Library.service;

import com.example.spring.Library.entity.Emprunt;
import com.example.spring.Library.repository.EmpruntRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpruntService implements EmpruntSv {

    private EmpruntRepository empruntRepository;

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
}
