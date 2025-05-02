package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @ = "Anotações"
// Uma anotação define o que a linha ligeiramente abaixo dela irá "fazer"
@NoArgsConstructor
@AllArgsConstructor
@Data                       // setters e getters
@Table(name = "aluno")      // Nomeia a tabela no banco de dados = "aluno"
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nome;

    private String cpf;

    private String email;
}
