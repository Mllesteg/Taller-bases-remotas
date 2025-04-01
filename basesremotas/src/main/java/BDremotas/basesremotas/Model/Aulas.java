package BDremotas.basesremotas.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Aulas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String aulanombre;
        private String tipo;

        @OneToOne
        private Televisor televisor;

    @OneToMany(mappedBy = "aula")
    private List<Estudiante> estudiantes;

}
