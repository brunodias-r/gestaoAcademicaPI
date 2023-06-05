package com.senac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.CompetenciaIndicador;

@Repository
public interface CopetenciaIndicadorRepository extends JpaRepository<CompetenciaIndicador, Long>{
	
	
}
