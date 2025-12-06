package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Disciplina;
import br.com.alunoonline.api.model.Professor;
import br.com.alunoonline.api.repository.DisciplinaRepository;
import br.com.alunoonline.api.repository.ProfessorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepository;
    private final ProfessorRepository professorRepository;

    public DisciplinaController(DisciplinaRepository disciplinaRepository,
                                ProfessorRepository professorRepository) {
        this.disciplinaRepository = disciplinaRepository;
        this.professorRepository = professorRepository;
    }

    // DTO para criação
    public record DisciplinaRequest(
            String nome,
            Integer cargaHoraria,
            Long professorId
    ) {}

    // DTO para atualização (campos opcionais)
    public record AtualizarDisciplinaRequest(
            String nome,
            Integer cargaHoraria,
            Long professorId
    ) {}

    // POST /disciplina  -> criar disciplina
    @PostMapping
    public ResponseEntity<Disciplina> criarDisciplina(@RequestBody DisciplinaRequest request) {
        Professor professor = professorRepository.findById(request.professorId())
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        Disciplina disciplina = new Disciplina();
        disciplina.setNome(request.nome());
        disciplina.setCargaHoraria(request.cargaHoraria());
        disciplina.setProfessor(professor);

        Disciplina salva = disciplinaRepository.save(disciplina);

        return ResponseEntity.status(HttpStatus.CREATED).body(salva);
    }

    // GET /disciplina  -> listar todas
    @GetMapping
    public ResponseEntity<List<Disciplina>> listarTodas() {
        List<Disciplina> disciplinas = disciplinaRepository.findAll();
        return ResponseEntity.ok(disciplinas);
    }

    // GET /disciplina/{id}  -> buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> buscarPorId(@PathVariable Long id) {
        return disciplinaRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // PUT /disciplina/{id}  -> atualizar
    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> atualizar(
            @PathVariable Long id,
            @RequestBody AtualizarDisciplinaRequest request
    ) {
        return disciplinaRepository.findById(id)
                .map(disciplina -> {
                    if (request.nome() != null) {
                        disciplina.setNome(request.nome());
                    }
                    if (request.cargaHoraria() != null) {
                        disciplina.setCargaHoraria(request.cargaHoraria());
                    }
                    if (request.professorId() != null) {
                        Professor professor = professorRepository.findById(request.professorId())
                                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));
                        disciplina.setProfessor(professor);
                    }

                    Disciplina atualizada = disciplinaRepository.save(disciplina);
                    return ResponseEntity.ok(atualizada);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE /disciplina/{id}  -> excluir
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!disciplinaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }

        disciplinaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
