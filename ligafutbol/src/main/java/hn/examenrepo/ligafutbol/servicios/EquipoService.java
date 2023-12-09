package hn.examenrepo.ligafutbol.servicios;

import hn.examenrepo.ligafutbol.modelos.Equipos;
import java.util.List;

public interface EquipoService {
    
    public Equipos crearEquipo(Equipos nvoEquipo);

    public String eliminarEquipoPorId(Integer numeroEquipo);

    public List<Equipos> obtenerTodosEquipos();
}
