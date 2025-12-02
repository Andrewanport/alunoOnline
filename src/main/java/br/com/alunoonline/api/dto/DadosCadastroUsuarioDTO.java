package br.com.alunoonline.api.dto;

import br.com.alunoonline.api.enums.UsuarioRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuarioDTO(
        @NotBlank String login,
        @NotBlank String senha,
        @NotNull UsuarioRole role
) {}