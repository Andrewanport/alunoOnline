package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarDisciplina(@RequestBody Disciplina disciplina){
        disciplinaService.criarDisciplina(disciplina);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Disciplina> listarTodasDisciplinas(){
        return disciplinaService.listarTodasDisciplinas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Disciplina> buscarDisciplinaPorId(@PathVariable Long id){
        return disciplinaService.buscarDisciplinaPorId(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarDisciplinaPorId(@PathVariable Long id){
        disciplinaService.deletarDisciplinaPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarDisciplinaPorId(@PathVariable Long id, @RequestBody Disciplina disciplina){
        disciplinaService.atualizarDisciplinaPorId(id, disciplina);
    }
}