package br.com.alunoonline.api.infra.security;

import br.com.alunoonline.api.model.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(Usuario usuario) {
        Algorithm alg = Algorithm.HMAC256(secret);

        return JWT.create()
                .withIssuer("aluno-online")
                .withSubject(usuario.getLogin()) // use o campo que seu UsuarioRepository busca
                .withExpiresAt(Instant.now().plus(2, ChronoUnit.HOURS))
                .sign(alg);
    }

    public String getSubject(String token) {
        Algorithm alg = Algorithm.HMAC256(secret);

        return JWT.require(alg)
                .withIssuer("aluno-online")
                .build()
                .verify(token)
                .getSubject();
    }
}
