package br.com.alunoonline.api.repository;

import br.com.alunoonline.api.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository <Disciplina,Long>{
        }