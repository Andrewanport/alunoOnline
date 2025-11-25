package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.dto.DadosCadastroUsuarioDTO;
import br.com.alunoonline.api.model.Usuario;
import br.com.alunoonline.api.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repo;
    private final PasswordEncoder encoder;

    public UsuarioController(UsuarioRepository repo, PasswordEncoder encoder) {
        this.repo = repo;
        this.encoder = encoder;
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DadosCadastroUsuarioDTO dto) {

        if (repo.findByLogin(dto.login()).isPresent()) {
            return ResponseEntity.badRequest().body("Login já existe");
        }

        Usuario user = new Usuario();
        user.setLogin(dto.login());
        user.setSenha(encoder.encode(dto.senha()));

        repo.save(user);
        return ResponseEntity.ok("Usuário criado");
    }
}
