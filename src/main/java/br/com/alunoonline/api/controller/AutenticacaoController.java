package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.infra.security.TokenService;
import br.com.alunoonline.api.infra.security.UserDetailsImpl;
import br.com.alunoonline.api.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public AutenticacaoController(AuthenticationManager authenticationManager,
                                  TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody LoginRequest request) {
        try {
            UsernamePasswordAuthenticationToken authToken =
                    new UsernamePasswordAuthenticationToken(request.login(), request.senha());

            Authentication authentication = authenticationManager.authenticate(authToken);

            UserDetailsImpl principal = (UserDetailsImpl) authentication.getPrincipal();
            Usuario usuario = principal.getUsuario();

            String token = tokenService.generateToken(usuario);

            return ResponseEntity.ok(new TokenResponse(token));
        } catch (AuthenticationException e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    // DTOs internos simples
    public record LoginRequest(String login, String senha) { }

    public record TokenResponse(String token) { }
}
