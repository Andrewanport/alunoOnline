package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController                     // Preparando as rotas HTTP de acordo com a arquitetura REST
@RequestMapping("/alunos")          // Mapeamento das requisições HTTP (!!!) - /alunos é um ENDPOINT!!!
public class AlunoController {

    // Injetando o service dentro do controller
    @Autowired
    AlunoService alunoService;

    // Criar aluno
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Quando o post dá certo = 201 Created
    public void criarAluno(@RequestBody Aluno aluno){     // @RequestBody = Converte o objeto JSON enviado pelo FRONT para objeto JAVA

        alunoService.criarAluno(aluno);

    }

    // Listar todos alunos
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> listarTodosAlunos() {

        return alunoService.listarTodosAlunos();

    }

    // Buscar alunos por id
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Aluno> buscarAlunoPorId(@PathVariable long id){

        return alunoService.buscarAlunoPorId(id);

    }

    // Deletar alunos por id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarAlunoPorId(@PathVariable Long id) {
        alunoService.deletarAlunoPorId(id);
    }


}

// Postman e Insominia = Clientes HTTP para testar a aplicação backend

