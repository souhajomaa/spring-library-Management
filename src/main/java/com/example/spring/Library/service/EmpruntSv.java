package com.example.spring.Library.service;

import com.example.spring.Library.entity.Emprunt;
import java.util.List;

public interface EmpruntSv {
    Emprunt getEmpruntById(Long id);
    List<Emprunt> getAllEmprunts();
    Emprunt saveEmprunt(Emprunt emprunt);
    Emprunt updateEmprunt(Emprunt emprunt);
    void deleteEmprunt(Long id);
    Emprunt emprunterLivre(Long livreId, String nom, String email);
}
