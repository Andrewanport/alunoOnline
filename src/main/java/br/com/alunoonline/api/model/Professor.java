package br.com.alunoonline.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(
        name = "professor",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_professor_cpf", columnNames = "cpf"),
                @UniqueConstraint(name = "uk_professor_email", columnNames = "email")
        }
)
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false, length = 150)
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinas;
}
