package com.example.spring.Library.repository;

import com.example.spring.Library.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {

}
