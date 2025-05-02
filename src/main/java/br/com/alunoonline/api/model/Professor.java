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

    private Long idProfessor;

    private String nomeProfessor;

    private String cpfProfessor;

    private String emailProfessor;

}



