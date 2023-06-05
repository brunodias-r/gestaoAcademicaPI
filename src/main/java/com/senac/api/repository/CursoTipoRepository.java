package com.senac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.CursoTipo;

@Repository
public interface CursoTipoRepository extends JpaRepository<CursoTipo, Long>{

}
