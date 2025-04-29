package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public void criarProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    public List<Professor> listarTodosProfessores() {
        return professorRepository.findAll();
    }

    public Optional<Professor> listarProfessorPorId(Long idProfessor) {
        return professorRepository.findById(idProfessor);
    }

    public void deletarProfessorPorId(Long idProfessor) {
        professorRepository.deleteById(idProfessor);
    }

    public void atualizarProfessor(Long idProfessor, Professor professor) {
        Optional<Professor> professorBancoDeDados = listarProfessorPorId(idProfessor);

        if (professorBancoDeDados.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Professor não encontrado no Banco de Dados");
        }

        Professor professorEdit = professorBancoDeDados.get();

        professorEdit.setNome(professor.getNome());
        professorEdit.setEmail(professor.getEmail());
        professorEdit.setCpf(professor.getCpf());

        professorRepository.save(professorEdit);

    }
}

