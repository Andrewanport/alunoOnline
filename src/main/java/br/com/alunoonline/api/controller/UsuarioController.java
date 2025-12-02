package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.dto.DadosCadastroUsuarioDTO;
import br.com.alunoonline.api.enums.UsuarioRole;
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

        // Se vier role no DTO, usa. Senão, define USER como padrão.
        if (dto.role() != null) {
            user.setRole(dto.role());
        } else {
            user.setRole(UsuarioRole.USER);
        }

        repo.save(user);
        return ResponseEntity.ok("Usuário criado");
    }

}
