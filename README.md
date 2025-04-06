# 📘 Aluno Online

> Projeto backend desenvolvido em Java com Spring Boot para cadastro de alunos.

---

## 📚 Descrição

O **Aluno Online** é uma API RESTful voltada para o gerenciamento de alunos, com operações básicas como criação de registros. O projeto foi estruturado em camadas e utiliza Spring Boot com integração ao banco de dados PostgreSQL.

---

## 🚀 Tecnologias utilizadas

- Java 17 (Amazon Corretto)
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

---

## ⚙️ Como rodar o projeto

### ✔️ Pré-requisitos

- JDK 17 (Corretto ou outro)
- PostgreSQL rodando localmente
- IDE (IntelliJ, VS Code, Eclipse)
- Postman (para testar)

### ▶️ Executar com IntelliJ:

1. Abra o projeto
2. Vá até a classe `AlunoOnlineApplication.java`
3. Clique no botão verde ▶️ ou use `Run`

### ▶️ Executar via terminal (se configurado):

./mvnw spring-boot:run

## 💾 Banco de dados
Certifique-se de que o PostgreSQL está rodando e que o banco aluno_online foi criado.

Credenciais padrão (em application.properties):

### spring.datasource.url=jdbc:postgresql://localhost:5432/aluno_online
### spring.datasource.username=postgres
### spring.datasource.password=1234

## 📨 Testando com Postman
### Criar aluno

POST http://localhost:8080/alunos
Body (JSON):

{
  "nome": "João da Silva",
  "cpf": "12345678900",
  "email": "joao@email.com"
}

## Status do projeto
### 🚧 Em desenvolvimento:

✅ Criar aluno (POST)

⏹ Excluir aluno (DELETE)

⏹ Atualização parcial (PATCH)

⏹ Listagem e busca de alunos (GET)

## 📸 Registros de funcionamento
![{417AF8C5-5021-4F4C-B652-182F8AF4B956}](https://github.com/user-attachments/assets/f6c183f0-8f3f-4591-bc03-53489ca70236)
![{F24F0984-CE23-4E30-B0B2-B85C23F56646}](https://github.com/user-attachments/assets/1dcb23f3-5f16-4ad6-b542-2e139fc34a44)



