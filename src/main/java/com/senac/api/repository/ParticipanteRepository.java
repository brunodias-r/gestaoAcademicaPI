package com.senac.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.api.entity.Participante;

@Repository
public interface ParticipanteRepository extends JpaRepository<Participante, Long>{

}
