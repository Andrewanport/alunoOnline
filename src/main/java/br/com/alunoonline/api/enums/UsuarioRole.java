package br.com.alunoonline.api.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UsuarioRole implements GrantedAuthority {
    ADMIN, USER;

    @Override
    public String getAuthority() {
        return "ROLE_" + name();
    }
}
