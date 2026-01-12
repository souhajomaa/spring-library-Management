package com.example.spring.Library.service;

import com.example.spring.Library.entity.Livre;
import java.util.List;

public interface LivreSv {
    Livre getLivreById(Long id);
    List<Livre> getAllLivres();
    Livre saveLivre(Livre livre);
    Livre updateLivre(Livre livre);
    void deleteLivre(Long id);
}
