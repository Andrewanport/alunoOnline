package br.com.alunoonline.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode(of = "id")
@Entity
@Table(
        name = "aluno",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_aluno_cpf", columnNames = "cpf"),
                @UniqueConstraint(name = "uk_aluno_email", columnNames = "email")
        }
)
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, length = 150)
    private String email;

    // opcional, mas ajuda MUITO no histórico
    @JsonIgnore
    @OneToMany(mappedBy = "aluno")
    private List<MatriculaAluno> matriculas;
}
