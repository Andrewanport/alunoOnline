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

---

### ▶️ Executar com IntelliJ:

1. Abra o projeto
2. Vá até a classe `AlunoOnlineApplication.java`
3. Clique no botão verde ▶️ ou use `Run`

---

### ▶️ Executar via terminal (se configurado):

./mvnw spring-boot:run

---

## 💾 Banco de dados
Certifique-se de que o PostgreSQL está rodando e que o banco aluno_online foi criado.

Credenciais padrão (em application.properties):

### spring.datasource.url=jdbc:postgresql://localhost:5432/aluno_online
### spring.datasource.username=postgres
### spring.datasource.password=1234

---

## 📨 Testando com Postman
### Criar aluno

POST http://localhost:8080/alunos

Body (JSON):

{
  "nome": "André",
  "cpf": "111.111.111-11",
  "email": "andre@gmail.com"
}

---

## Status do projeto
### 🚧 Em desenvolvimento:

✅ Criar aluno (POST)

✅ Listagem de todos alunos (GET)

✅ Busca de alunos por ID (GET)

⏹ Excluir aluno (DELETE)

⏹ Atualização parcial (PATCH)

---

## 📸 Registros de funcionamento
### Criar Aluno:
![{1C02B516-C1C8-4D39-9DBE-B319A83DCDA7}](https://github.com/user-attachments/assets/2a9ee4ed-7797-46e2-8575-818a82fc9bd2)
### Aluno criado no banco de dados:
![{5F902693-E541-44BE-879B-8BD9FFACD0C0}](https://github.com/user-attachments/assets/7af05459-7a1b-452c-8785-a03873a6ae8c)
### Listar Alunos:
![{37196748-5F37-4C69-B501-06332CCF7751}](https://github.com/user-attachments/assets/21485694-bc8f-49f2-9eb7-c803b0b94023)
### Buscar Aluno por ID:
![{6A11011A-3AC6-43BD-B0A7-6B9AE08A6CD9}](https://github.com/user-attachments/assets/b1030359-1b77-4c0b-bc36-6beae6f208b4)
### Buscar Aluno por ID (DBeaver):
![{5DC075DF-D8DF-4813-AD54-C183EFDE2E0B}](https://github.com/user-attachments/assets/673868b3-30a9-41b9-b50e-08ff452b9c6d)
