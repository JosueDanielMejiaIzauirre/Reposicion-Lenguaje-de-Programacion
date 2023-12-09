package hn.examenrepo.ligafutbol.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.examenrepo.ligafutbol.repositorios.EquiposRepository;
import hn.examenrepo.ligafutbol.servicios.EquipoService;
import hn.examenrepo.ligafutbol.modelos.Equipos;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquiposRepository equipoRepository;

    @Override
    public Equipos crearEquipo(Equipos nvoEquipo) {
        return equipoRepository.save(nvoEquipo);
    }

    @Override
    public String eliminarEquipoPorId(Integer numeroEquipo) {
        Equipos equipoeliminar = this.equipoRepository.findById(numeroEquipo).get();

        if (equipoeliminar != null) {
            this.equipoRepository.delete(equipoeliminar);
            return "El equipo" + equipoeliminar + "se ha elminado";
        }
        return "El equipo" + equipoeliminar + "no existe";
    }

    @Override
    public List<Equipos> obtenerTodosEquipos() {
        return this.equipoRepository.findAll();
    }

    
}
