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
    @Column(name = "id_disciplina")
    private Long id;
    @Column(name = "nome_disciplina")
    private String nome;
    @Column(name = "carga_horaria_disciplina")
    private Integer cargaHoraria;
    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;
}
