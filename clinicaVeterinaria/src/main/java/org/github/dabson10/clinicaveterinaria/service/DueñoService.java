package org.github.dabson10.clinicaveterinaria.service;

import org.github.dabson10.clinicaveterinaria.DTOs.DueñoDTO;
import org.github.dabson10.clinicaveterinaria.entity.Dueño;
import org.github.dabson10.clinicaveterinaria.entity.Mascota;
import org.github.dabson10.clinicaveterinaria.repository.InDueñoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DueñoService implements InDueñoService{

    final InDueñoRepository dueRe;
    final MascotaService masRe;

    public DueñoService(InDueñoRepository dueRe, MascotaService masRe){
        this.dueRe = dueRe;
        this.masRe = masRe;
    }

    @Override
    public void createDueño(Dueño dueño) {
        dueRe.save(dueño);
    }

    @Override
    public Dueño getDueño(Long id) {
        return dueRe.findById(id).orElse(null);
    }

    @Override
    public List<DueñoDTO> getDueños() {
        List<Dueño> lista = dueRe.findAll();
        List<DueñoDTO> listD = new ArrayList<>();

        for(Dueño duen : lista){

            DueñoDTO duendto = new DueñoDTO();
            Mascota masc = duen.getMascota();

            duendto.setId_dueno(duen.getId_dueno());
            duendto.setDni(duen.getDni());
            duendto.setNombre(duen.getNombre());
            duendto.setApellido(duen.getApellido());
            duendto.setCelular(duen.getCelular());
            duendto.setId_mascota(masc.getId_mascota());
            listD.add(duendto);
        }
        return listD;
    }

    @Override
    public void editDueño(DueñoDTO dueño) {
        Dueño duen = this.getDueño(dueño.getId_dueno());
        Mascota masc = masRe.getMascota(dueño.getId_mascota());

        duen.setDni(dueño.getDni());
        duen.setNombre(dueño.getNombre());
        duen.setApellido(dueño.getApellido());
        duen.setCelular(dueño.getCelular());
        duen.setMascota(masc);

        dueRe.save(duen);
    }

    @Override
    public void deletDueño(Long id) {
        dueRe.deleteById(id);
    }
}
