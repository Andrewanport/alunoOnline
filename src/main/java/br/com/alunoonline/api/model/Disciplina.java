package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "disciplinas")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDisciplina;
    private Integer cargaHorariaDisciplina;
    @ManyToOne
    @JoinColumn(name = "id_Professor")
    private Professor professorDisciplina;

}
