package com.github.Dabson10.PruebaJPA.repository;

import com.github.Dabson10.PruebaJPA.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMascotaRepository extends JpaRepository<Mascota, Long> {
}
