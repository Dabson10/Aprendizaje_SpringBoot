package org.github.dabson10.cursojpa.repository;

import org.github.dabson10.cursojpa.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InTemaRepository extends JpaRepository<Tema, Long> {
}
