package main.java.hn.examenrepo.ligafutbol.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.examenrepo.ligafutbol.modelos.Equipos;
import hn.examenrepo.ligafutbol.servicios.impl.EquipoServiceImpl;

@RestController
@RequestMapping("/api/equipos")
public class EquipoController {
    
    @Autowired
    private EquipoServiceImpl equipoServiceImpl;

    @PostMapping("/crear")
    public Equipos crearEquipo(@RequestBody Equipos nvoEquipo){
        return this.equipoServiceImpl.crearEquipo(nvoEquipo);
    }

    @DeleteMapping("/eliminar")
    public String eliminarEquipoPorId(@RequestParam(name="codigoEquipo") Integer codigoEquipo){
        return this.equipoServiceImpl.eliminarEquipoPorId(codigoEquipo);
    }
    
    @GetMapping("/obtener")
    public List<Equipos> obtenerTodos(){
        return this.equipoServiceImpl.obtenerTodosEquipos();
    }
}
