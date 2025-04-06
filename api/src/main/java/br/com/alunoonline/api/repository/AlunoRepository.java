package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// O Spring data entende que esse é o repository graças à anotação = "@Repository"
@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

// Com o repository previamente feito, eu consigo injetar as dependências do reposotory no do Service,
// assim o service consegue Acessar o banco de dados!