package org.github.dabson10.cursojpa.repository;

import org.github.dabson10.cursojpa.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InCursoRepository extends JpaRepository<Curso, Long> {
}
