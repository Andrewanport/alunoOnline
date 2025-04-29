package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_disciplina") // nome real da coluna no banco
    private String nome;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "professor_id") // chave estrangeira para professor
    private Professor professor;
}
