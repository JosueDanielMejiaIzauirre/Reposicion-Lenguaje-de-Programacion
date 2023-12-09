package hn.examenrepo.ligafutbol.modelos;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.OneToOne;

@Entity
@Table(name="posiciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Posiciones {
    
    @JsonIgnore
    @OneToOne
    private int codigoEquipo;

    private int empates;

    private int ganados;

    private int perdidos;

    private int golesFavor;

    private int golesContra;

    private int puntos;
}
