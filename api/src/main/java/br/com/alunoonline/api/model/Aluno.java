package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @ = "Anotações"
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "aluno")
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Atributos
    private Long id;

    private String nome;

    private String cpf;

    private String email;
}
