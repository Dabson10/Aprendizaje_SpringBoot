package org.github.dabson10.clinicaveterinaria.repository;

import org.github.dabson10.clinicaveterinaria.entity.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InDueñoRepository extends JpaRepository<Dueño, Long> {
}
