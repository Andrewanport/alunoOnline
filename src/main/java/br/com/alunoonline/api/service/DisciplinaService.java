package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public void criarDisciplina (Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }
    public List<Disciplina> listarTodasDisciplinas(){
        return disciplinaRepository.findAll();
    }

    public Optional<Disciplina> buscarDisciplinaPorId(Long idDisciplina){
        return disciplinaRepository.findById(idDisciplina);
    }

    public void deletarDisciplinaPorId(Long idDisciplina){
        disciplinaRepository.deleteById(idDisciplina);
    }

    public void atualizarDisciplinaPorId(Long idDisciplina, Disciplina disciplina){
        Optional<Disciplina> disciplinaDoBancoDeDados = buscarDisciplinaPorId(idDisciplina);

        if (disciplinaDoBancoDeDados.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Disciplina não encontrada no banco de dados.");
        }
        Disciplina disciplinaParaEditar = disciplinaDoBancoDeDados.get();
        disciplinaParaEditar.setNomeDisciplina(disciplina.getNomeDisciplina());
        disciplinaParaEditar.setCargaHorariaDisciplina(disciplina.getCargaHorariaDisciplina());
        disciplinaParaEditar.setProfessorDisciplina(disciplina.getProfessorDisciplina());
        disciplinaRepository.save(disciplinaParaEditar);
    }
}