package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public void atualizarAlunoPorId(Long id, Aluno aluno){
        // 1. VER SE O ALUNO EXISTE NO BD
        Optional<Aluno> alunoDoBancoDeDados = buscarAlunoPorId(id);

        // 2. SE NÃO EXISTIR
        if (alunoDoBancoDeDados.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Aluno não encontrado no banco de dados");
        }

        // 3. SE EXISTIR O ALUNO COM ESSE ID NO BD: ARMAZENAMOS EM VARIAVEL E DEPOIS EDITAMOS
        Aluno alunoParaEditar = alunoDoBancoDeDados.get();

        // 4. AGORA, FAZEMOS OS SETS NECESSÁRIOS PARA ATUALIZAR OS ATRIBUTOS DO ALUNO QUE PEGAMOS (GET)
        alunoParaEditar.setNome(aluno.getNome());
        alunoParaEditar.setCpf(aluno.getCpf());
        alunoParaEditar.setEmail(aluno.getEmail());

        alunoRepository.save(alunoParaEditar);

    }

    // Aluno vai para o banco de dados com a ajuda do repository que já está injetado dentro do service
}