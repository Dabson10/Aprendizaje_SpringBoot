package org.github.dabson10.clinicaveterinaria.service;

import org.github.dabson10.clinicaveterinaria.DTOs.DueñoDTO;
import org.github.dabson10.clinicaveterinaria.entity.Dueño;

import java.util.List;

public interface InDueñoService {
    public void createDueño(Dueño dueño);

    public Dueño getDueño(Long id);
    public DueñoDTO getDueñoDTO(Long id);
    public List<DueñoDTO> getDueños();

    public void editDueño(DueñoDTO dueño);

    public void deletDueño(Long id);
}
