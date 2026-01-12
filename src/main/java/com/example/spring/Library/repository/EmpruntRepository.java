package com.example.spring.Library.repository;

import com.example.spring.Library.entity.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Long> {

}
