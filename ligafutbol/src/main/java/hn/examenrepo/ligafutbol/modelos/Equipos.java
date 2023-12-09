package hn.examenrepo.ligafutbol.modelos;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="equipos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipos {
    
    @Id
    @OneToOne(mappedBy = "equipos", cascade = CascadeType.ALL)
    private int codigoEquipo;
    
    private String nomrbe;

    private double ataque;

    private double defensa;

    private List<Equipos> equipos = new ArrayList<>();
}
