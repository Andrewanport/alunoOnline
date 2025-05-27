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
- Postman/Insomnia (para testar)

---

### ▶️ Executar com IntelliJ:

1. Abra o projeto
2. Vá até a classe `AlunoOnlineApplication.java`
3. Clique no botão verde ▶️ ou use `Run`

---

## 💾 Banco de dados
Certifique-se de que o PostgreSQL está rodando e que o banco aluno_online foi criado.

Credenciais padrão (em application.properties):

### spring.datasource.url=jdbc:postgresql://localhost:5432/aluno_online
### spring.datasource.username=postgres
### spring.datasource.password=1234

---

## Status do projeto
### 🚧 Em desenvolvimento:
✅ CRUD Aluno
✅ CRUD Professor
✅ CRUD Disciplina
---

## 📸 Registros de funcionamento (Aluno)
### Criar Aluno (Insomnia):
![{1C02B516-C1C8-4D39-9DBE-B319A83DCDA7}](https://github.com/user-attachments/assets/2a9ee4ed-7797-46e2-8575-818a82fc9bd2)
### Aluno criado (DBeaver):
![{5F902693-E541-44BE-879B-8BD9FFACD0C0}](https://github.com/user-attachments/assets/7af05459-7a1b-452c-8785-a03873a6ae8c)
### Listar Alunos (Insomnia):
![{37196748-5F37-4C69-B501-06332CCF7751}](https://github.com/user-attachments/assets/21485694-bc8f-49f2-9eb7-c803b0b94023)
### Listar Alunos (DBeaver):
![{652B3287-0211-4521-A958-ACAED9788E90}](https://github.com/user-attachments/assets/68f295c5-b5da-4141-91ef-a78da5cd5318)
### Buscar Aluno por ID (Insomnia):
![{6A11011A-3AC6-43BD-B0A7-6B9AE08A6CD9}](https://github.com/user-attachments/assets/b1030359-1b77-4c0b-bc36-6beae6f208b4)
### Buscar Aluno por ID (DBeaver):
![{5DC075DF-D8DF-4813-AD54-C183EFDE2E0B}](https://github.com/user-attachments/assets/673868b3-30a9-41b9-b50e-08ff452b9c6d)
### Atualizar Aluno por ID (Insomnia):
![{5E791D37-D343-48C1-9485-78C2B37EE31A}](https://github.com/user-attachments/assets/20bb5275-7620-44cb-8c15-bc1c66c13278)
### Aluno Atualizado por ID (DBeaver):
![{466C52AC-D726-4B73-B25D-A5D40548A868}](https://github.com/user-attachments/assets/f9703d5c-c178-4c41-95bc-b5f9e1461795)
### Deletar Aluno por ID (ID: 2) (Insomnia):
![{E17C3A1D-27FE-4F7C-946F-FE6B812329B8}](https://github.com/user-attachments/assets/b00dc07d-54b1-4325-9cdd-517bfd389048)
![{DBDF6916-0E1E-4C29-BEEB-D4ADC69BF146}](https://github.com/user-attachments/assets/b35133fb-9bbf-4e38-90fa-da8cfe0550c6)
### Aluno "Jorge" (ID: 2) deletado (DBeaver):
![{BCFB1692-54F0-4498-9A1F-8D1244099F3D}](https://github.com/user-attachments/assets/b2f1a878-3f78-46f5-b8b4-2fcd1b2b02d7)

## 📸 Registros de funcionamento (Professor)
### Criar Professor (Insomnia):
![{3E4C5FD2-EFFB-4D86-A60A-D5DA6B4F1D31}](https://github.com/user-attachments/assets/78edf03b-bd19-4ccc-9050-448eae89ac7f)
### Professor criado (DBeaver):
![{2E40B3B8-D6A7-41EC-AF8C-7851DA195AEA}](https://github.com/user-attachments/assets/22958048-fec5-43ed-baa5-0b58191690fe)
### Listar Professores (Insomnia):
![{F63A0B71-EBE7-49CE-86D8-3174E834BB20}](https://github.com/user-attachments/assets/93cc7391-d040-44b1-9852-76727cc400c9)
### Listar Professores (DBeaver):
![{239BADC8-9B15-41A7-8FA3-F7FA1825ED28}](https://github.com/user-attachments/assets/2d7e40f3-52c0-45ed-a02e-e0fee99fc700)
### Buscar Professor por ID (Insomnia):
![{323C930C-DD3B-43E4-A1A5-332AB6E03628}](https://github.com/user-attachments/assets/b8cd8fde-3a4e-4c54-b5fd-8f718f01cf81)
### Buscar Professor por ID (DBeaver):
![{DDC9D264-25A0-4F50-8537-C7450DDB38CF}](https://github.com/user-attachments/assets/24cb3bed-7e64-4950-846a-bea9a93bd94d)
### Atualizar Professor por ID (Insomnia):
![{043D5067-4760-46C0-A260-5261754A2A7D}](https://github.com/user-attachments/assets/efbd4ac2-8a63-485c-a259-3dd92f2d16bf)
### Professor Atualizado por ID (DBeaver):
![{CFBBD7C5-59D5-4237-8DA0-25D8236B0FE4}](https://github.com/user-attachments/assets/d44c4872-ccd5-49e9-b3e0-e38f1824430d)
### Deletar Professor por ID (ID: 14) (Insomnia):
![{C615FFB8-97EB-4D7C-92D6-0442CEC80DE4}](https://github.com/user-attachments/assets/6a2daa51-be1c-424e-96c1-0ebeb98a97b9)
### Professor (ID: 14) deletado (DBeaver):
![{F9622A9B-414A-4073-A97B-5FC315DCC805}](https://github.com/user-attachments/assets/d24ec920-6394-4c40-b1dd-9623f68d4b9e)

## 📸 Registros de funcionamento (Disciplina)

### Criar Disciplina (Insomnia):
![{0BB7DD9A-5548-4935-8200-DBE07A6DA162}](https://github.com/user-attachments/assets/3d0babb0-9eed-4abf-84cc-0590929d59f4)
### Disciplina criada (DBeaver):
![Imagem do WhatsApp de 2025-04-29 à(s) 15 54 47_7f3d429b](https://github.com/user-attachments/assets/d11b3285-8b65-45d2-abde-0be98fb24275) 
### Listar Disciplinas (Insomnia):
![Imagem do WhatsApp de 2025-04-29 à(s) 16 03 08_3813424a](https://github.com/user-attachments/assets/068c370a-9f53-477d-8c47-8d7f676996f4)
### Buscar Disciplina por ID (Insomnia):
![Imagem do WhatsApp de 2025-04-29 à(s) 16 05 22_0dbca31b](https://github.com/user-attachments/assets/25215016-4c88-4379-8094-d6083be37805)
### Buscar Disciplina por ID (DBeaver):
![{E605D930-12E2-4516-BA15-3DE5FF42FF7E}](https://github.com/user-attachments/assets/835931f7-027a-48e1-9ff3-d7865ffa7709)
### Atualizar Disciplina por ID (Insomnia):
![{AAE46CC3-7AF2-4A82-9895-79EC6EA0FE89}](https://github.com/user-attachments/assets/a18a21ed-9507-470b-b83e-6879c3b4af07)
### Disciplina atualizada por ID (DBeaver):
![{4CCB1E9D-3939-4835-97AE-23ADDFD7E2F9}](https://github.com/user-attachments/assets/f0d5b8a0-fc88-4e7d-942c-dc2b5d127c63)
### Deletar Disciplina por ID (ID: 33) (Insomnia):
![{89CDE471-AEF8-4982-9E1F-DE74043D6BB2}](https://github.com/user-attachments/assets/9ac19cdb-7c76-463f-9788-e712808df7a9)
### Disciplina (ID: 25) deletado (DBeaver):
![{5297C3C6-89D4-4E04-BA49-02FC65890FC5}](https://github.com/user-attachments/assets/703c1718-4abc-4a49-a3b3-3c7fda7d0911)

## 📸 Registros de funcionamento (Matrícula)
### Criar Matrícula (Insomnia):
![{BB5BCDBC-57CE-4F1A-90F4-6F96E9AB8601}](https://github.com/user-attachments/assets/53de24d6-0b5b-499f-aeac-b7639265aefc)
### Matrícula criada (DBeaver):
![{A8A5E679-2B2C-4196-B89B-535A348A20A7}](https://github.com/user-attachments/assets/3df8cff7-52cb-4bab-a91a-fe2efac2b4cc)

## 📸 Registros de funcionamento (Swagger)
![{0D7182E1-FCD1-4120-8761-077CCB697949}](https://github.com/user-attachments/assets/feb41070-c16f-4935-b7a9-78ac7954e4a5)
![{F6C3D184-4882-4292-9DB4-2A9DCA508D30}](https://github.com/user-attachments/assets/44a75555-51cf-4210-b25a-b760972d9b21)
![{462742DD-9D32-4F4A-8636-D056A2B302F0}](https://github.com/user-attachments/assets/01624513-86bf-43c7-80b7-7e9c48af48a5)
