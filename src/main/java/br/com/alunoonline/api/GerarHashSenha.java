package br.com.alunoonline.api;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GerarHashSenha {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String hash = encoder.encode("1234");
        System.out.println(hash);
    }
}