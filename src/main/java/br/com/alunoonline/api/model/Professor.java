package br.com.alunoonline.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "professor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor")
    private Long id_Professor;

    @Column(name = "nome_professor")
    private String nome_Professor;

    @Column(name = "cpf_professor")
    private String cpf_Professor;

    @Column(name = "email_professor")
    private String email_Professor;
}



