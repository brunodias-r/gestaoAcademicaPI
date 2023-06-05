package com.senac.api.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.api.entity.CompetenciaIndicador;
import com.senac.api.exception.ObjectnotFoundException;
import com.senac.api.repository.CopetenciaIndicadorRepository;

@Service
public class CopetenciaIndicadorService {

	@Autowired 
	private CopetenciaIndicadorRepository copetenciaIndicadorRepository;
	
	public CompetenciaIndicador adicionar(CompetenciaIndicador copetenciaIndicador) {
		copetenciaIndicador.setId(null);
		copetenciaIndicador = copetenciaIndicadorRepository.save(copetenciaIndicador);
		copetenciaIndicador.setId(copetenciaIndicador.getId());
		return copetenciaIndicador;
	}
	
	public List<CompetenciaIndicador> obterTodos(){
		List<CompetenciaIndicador> copetenciaIndicadores = copetenciaIndicadorRepository.findAll();
		return copetenciaIndicadores.stream().map(copetenciaIndicador -> new ModelMapper().map(copetenciaIndicador, CompetenciaIndicador.class)).collect((Collectors.toList()));
	}
	
	public Optional<CompetenciaIndicador> obterPorId(Long id){
		Optional<CompetenciaIndicador> copetenciaIndicador = copetenciaIndicadorRepository.findById(id);
		
		if(copetenciaIndicador.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID : '" + id + "' NÃO ENCONTRADO!");
		}
		
		return copetenciaIndicador;
	}
	
	public CompetenciaIndicador atualizar(Long id, CompetenciaIndicador copetenciaIndicador) {
		Optional<CompetenciaIndicador> copetenciaIndicadorId = copetenciaIndicadorRepository.findById(id);
		
		if(copetenciaIndicadorId.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID: '" + id + "' NÃO ENCONTRADO!");
		}
		
		copetenciaIndicador.setId(id);
		copetenciaIndicador.setId(id);
		copetenciaIndicadorRepository.save(copetenciaIndicador);
		return copetenciaIndicador;
	}
	
	
	public void deletar(Long id) {
		Optional<CompetenciaIndicador> copetenciaIndicador = copetenciaIndicadorRepository.findById(id);
		
		if(copetenciaIndicador.isEmpty()) {
			throw new ObjectnotFoundException("CURSO COM ID: '\" + id + \"' NÃO ENCONTRADO!");
		}
		
		copetenciaIndicadorRepository.deleteById(id);
	}
}
