package hn.examenrepo.ligafutbol.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hn.examenrepo.ligafutbol.modelos.Posiciones;
import hn.examenrepo.ligafutbol.repositorios.PosicionesRepository;
import hn.examenrepo.ligafutbol.servicios.PosicionesService;

public class PosicionesServiceImpl implements PosicionesService{

    @Autowired
    private PosicionesRepository equipoRepository;

    @Override
    public List<Posiciones> obtenerTodasPosiciones() {
        return this.equipoRepository.findAll();
    }
    
}
