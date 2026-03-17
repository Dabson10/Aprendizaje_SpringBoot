package org.github.dabson10.clinicaveterinaria.repository;

import org.github.dabson10.clinicaveterinaria.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InMascotaRepository extends JpaRepository<Mascota, Long> {
}
