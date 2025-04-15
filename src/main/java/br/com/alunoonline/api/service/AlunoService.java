package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    // Injeção de dependencias do repository
    @Autowired
    AlunoRepository alunoRepository;

    public void criarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    public List<Aluno> listarTodosAlunos(){
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarAlunoPorId(long id){
        return alunoRepository.findById(id);
    }

    public void deletarAlunoPorId(Long id) {
        if (!alunoRepository.existsById(id)) {
            throw new RuntimeException("Aluno com ID " + id + " não encontrado.");
        }
        alunoRepository.deleteById(id);
    }




    // Aluno vai para o banco de dados com a ajuda do repository que já está injetado dentro do service
}