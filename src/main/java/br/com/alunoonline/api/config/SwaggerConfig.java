package br.com.alunoonline.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API - Aluno Online")
                        .version("1.0")
                        .description("Documentação da API do sistema Aluno Online")
                        .contact(new Contact()
                                .name("André Wn")
                                .email("andrewanderleyporto@email.com")
                                .url("https://github.com/Andrewanport")));
    }
}
