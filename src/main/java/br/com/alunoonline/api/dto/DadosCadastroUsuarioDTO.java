package br.com.alunoonline.api.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuarioDTO(
        @NotBlank String login,
        @NotBlank String senha
) {}
