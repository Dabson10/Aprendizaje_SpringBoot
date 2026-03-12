package com.github.Dabson10.PruebaJPA.repository;

import com.github.Dabson10.PruebaJPA.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InPersonaRepository extends JpaRepository<Persona, Long> {
}
