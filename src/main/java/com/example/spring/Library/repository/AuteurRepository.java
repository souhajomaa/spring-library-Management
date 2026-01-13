package com.example.spring.Library.repository;

import com.example.spring.Library.entity.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuteurRepository extends JpaRepository<Auteur, Long> {

    Auteur getAuteurById(Long id);

}