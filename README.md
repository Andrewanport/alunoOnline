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

⏹ Excluir aluno (DELETE)

⏹ Atualização parcial (PATCH)

⏹ Listagem e busca de alunos (GET)

---

## 📸 Registros de funcionamento
### Criar Aluno:
![{F24F0984-CE23-4E30-B0B2-B85C23F56646}](https://github.com/user-attachments/assets/1dcb23f3-5f16-4ad6-b542-2e139fc34a44)
### Aluno criado no banco de dados:
![{417AF8C5-5021-4F4C-B652-182F8AF4B956}](https://github.com/user-attachments/assets/f6c183f0-8f3f-4591-bc03-53489ca70236)
### Listar Alunos:
![{72BEB554-25E9-4EA2-A5C6-B06FDB4DAB9C}](https://github.com/user-attachments/assets/6cfcb415-2fb1-4d9e-ad02-7b4400e5f832)
### Buscar Aluno por ID:
![{0BEFAB0D-70F2-48B3-9FC8-4EEB927D1CD3}](https://github.com/user-attachments/assets/94d8214c-55df-4ee5-a1dd-6574a2352085)
