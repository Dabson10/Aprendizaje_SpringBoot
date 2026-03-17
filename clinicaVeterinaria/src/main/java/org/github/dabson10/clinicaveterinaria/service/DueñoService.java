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
    //Funcion para obtener los datos del Dueño en un DTO para que no exista el error
    //del JSON infinito.
    @Override
    public DueñoDTO getDueñoDTO(Long id){
        Dueño duen = this.getDueño(id);
        return guardarEnDTO(duen);
    }
    @Override
    public List<DueñoDTO> getDueños() {
        List<Dueño> lista = dueRe.findAll();
        List<DueñoDTO> listD = new ArrayList<>();

        for(Dueño duen : lista){
            DueñoDTO duendto = guardarEnDTO(duen);
            listD.add(duendto);
        }
        return listD;
    }

    /**
     * Esta función sirve para simplificar código que había en la función de {@link #getDueños()} y {@link #getDueñoDTO(Long)}
     *  ya que en ambas se repetirá la sección de guardar datos de objeto en objeto.
     * @param duen : Este objeto contendrá los datos iniciales de la clase Dueño incluido el objeto de mascota
     *             que después se usara para obtener él, id de mascota.
     * @return : Regresará el DTO compuesto con los datos del Dueño y él, id de la mascota
     */
    public DueñoDTO guardarEnDTO(Dueño duen){
        DueñoDTO duendto = new DueñoDTO();
        Mascota masc = duen.getMascota();

        duendto.setId_dueno(duen.getId_dueno());
        duendto.setDni(duen.getDni());
        duendto.setNombre(duen.getNombre());
        duendto.setApellido(duen.getApellido());
        duendto.setCelular(duen.getCelular());
        duendto.setId_mascota(masc.getId_mascota());
        return duendto;
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
