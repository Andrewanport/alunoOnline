package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController                     // Preparando as rotas HTTP de acordo com a arquitetura REST
@RequestMapping("/alunos")          // Mapeamento
public class AlunoController {

    // Injetando o service dentro do controller
    @Autowired
    AlunoService alunoService;

    // POST = CRIAR
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAluno(@RequestBody Aluno aluno){     // @RequestBody = Converte o objeto JSON enviado pelo FRONT para objeto JAVA

        alunoService.criarAluno(aluno);

    }

}

// Postman e Insominia = Clientes HTTP para testar a aplicação backend
