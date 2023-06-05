package com.senac.api.DBService;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.api.entity.Curso;
import com.senac.api.entity.CursoTipo;
import com.senac.api.entity.DiaLetivo;
import com.senac.api.entity.Estudante;
import com.senac.api.entity.Grupo;
import com.senac.api.entity.Modulo;
import com.senac.api.entity.Oferta;
import com.senac.api.entity.Participante;
import com.senac.api.entity.Periodo;
import com.senac.api.entity.Professor;
import com.senac.api.entity.Turno;
import com.senac.api.entity.UnidadeCurricular;
import com.senac.api.entity.Usuario;
import com.senac.api.repository.CopetenciaIndicadorRepository;
import com.senac.api.repository.CursoRepository;
import com.senac.api.repository.CursoTipoRepository;
import com.senac.api.repository.DiaLetivoRepository;
import com.senac.api.repository.EstudanteRepository;
import com.senac.api.repository.GrupoRepository;
import com.senac.api.repository.ModuloRepository;
import com.senac.api.repository.OfertaRepository;
import com.senac.api.repository.ParticipanteRepository;
import com.senac.api.repository.PeriodoRepository;
import com.senac.api.repository.ProfessorRepository;
import com.senac.api.repository.TurnoRepository;
import com.senac.api.repository.UnidadeCurricularRepository;
import com.senac.api.repository.UsuarioRepository;

@Service
public class DBService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	@Autowired
	private CursoTipoRepository cursoTipoRepository;
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired 
	private OfertaRepository ofertaRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	
	@Autowired
	private UnidadeCurricularRepository unidadeCurricularRepository;
	
	@Autowired 
	private CopetenciaIndicadorRepository copetenciaIndicadorRepository;
	
	@Autowired
	private EstudanteRepository estudanteRepository;
	
	@Autowired
	private TurnoRepository turnoRepository;
	
	@Autowired 
	private PeriodoRepository periodoRepository;
	
	@Autowired
	private GrupoRepository grupoRepository;
	
	@Autowired
	private ParticipanteRepository participanteRepository;
	
	@Autowired
	private DiaLetivoRepository diaLetivoRepository;
	
	public void instanciaDB() {
		
		//Usuário
		Usuario user1 = new Usuario(null, "06369408700", "Carlos Henrique", "Carlos", "carlos@gmail.com", null, "(21)99999-9999", null, "1234", true);
		Usuario user2 = new Usuario(null, "00000000000", "Luis Henrique", "Luis", "luis@gmail.com", null, "(21)99999-9999", null, "1234", true);
		usuarioRepository.saveAll(Arrays.asList(user1, user2));
		
		//professor
		Professor professor1 = new Professor(null, true, user2);
		professorRepository.saveAll(Arrays.asList(professor1));
		
		//curso_tipo
		CursoTipo cursoTipo1 = new CursoTipo(null, "Graduação", true);
		CursoTipo cursoTipo2 = new CursoTipo(null, "Pós-Graduação", true);
		CursoTipo cursoTipo3 = new CursoTipo(null, "Técnico", true);
		cursoTipoRepository.saveAll(Arrays.asList(cursoTipo1, cursoTipo2, cursoTipo3));
		
		//curso
		Curso curso1 = new Curso(null, "Análise e Desenvolivimento de Sistemas", "36124872021.1N", cursoTipo1, 200, true);
		Curso curso2 = new Curso(null, "Técnico de Informática", "36124872021.2N", cursoTipo3, 100, true);
		Curso curso3 = new Curso(null, "Hotelaria", "36124872022.2N", cursoTipo1, 200, true);
		Curso curso4 = new Curso(null, "Ciência de Dados", "36124872023.3N", cursoTipo2, 200, true);
		cursoRepository.saveAll(Arrays.asList(curso1, curso2, curso3, curso4));
		
		//oferta
		Oferta oferta1 = new Oferta(null, "Oferta 1", "aisdo0a98", true, curso1);
		Oferta oferta2 = new Oferta(null, "Oferta 2", "aisdo0a97", true, curso2);
		ofertaRepository.saveAll(Arrays.asList(oferta1, oferta2));
		
		//modulo
		Modulo modulo1 = new Modulo(null, "Módulo1", 50, oferta1);
		moduloRepository.saveAll(Arrays.asList(modulo1));
		
		//unidade_curricular
		UnidadeCurricular uc1 = new UnidadeCurricular(null, "asdji123", "Programação Web 1", "Prog Web 1", 100, 1, 1, true, modulo1);
		UnidadeCurricular uc2 = new UnidadeCurricular(null, "asdji124", "Tecnologia Web 1", "Tec Web 1", 100, 1, 1, true, modulo1);
		UnidadeCurricular uc3 = new UnidadeCurricular(null, "asdji125", "Banco de Dados 1", "BD 1", 100, 1, 1, true, modulo1);
		unidadeCurricularRepository.saveAll(Arrays.asList(uc1, uc2, uc3));
		
		//competencia
//		Copetencia comp1 = new Copetencia(null, "Competencia 1", 1, true, uc1);
//		Copetencia comp2 = new Copetencia(null, "Competencia 2", 1, true, uc1);
//		Copetencia comp3 = new Copetencia(null, "Competencia 3", 1, true, uc1);
//		copetenciaRepository.saveAll(Arrays.asList(comp1, comp2, comp3));
		
		//competencia_indicador
//		CompetenciaIndicador ind1 = new CompetenciaIndicador(null, "indicador 1", 1, comp1);
//		CompetenciaIndicador ind2 = new CompetenciaIndicador(null, "indicador 2", 1, comp1);
//		copetenciaIndicadorRepository.saveAll(Arrays.asList(ind1, ind2));
		
		//estudante
		Estudante estudante1 = new Estudante(null, null, null, true, user1, oferta1);
		estudanteRepository.saveAll(Arrays.asList(estudante1));
		
		//turno
		Turno turno1 = new Turno(null, "Manhã", true);
		Turno turno2 = new Turno(null, "Tarde", true);
		Turno turno3 = new Turno(null, "Noite", true);
		turnoRepository.saveAll(Arrays.asList(turno1, turno2, turno3));
		
		//periodo
		Periodo periodo1 = new Periodo(null, "Periodo 1", true);
		periodoRepository.saveAll(Arrays.asList(periodo1));
		
		//grupo
		Grupo grupo1 = new Grupo(null, "Grupo 1", null, "306", true, turno1, uc1, periodo1, professor1);
		grupoRepository.saveAll(Arrays.asList(grupo1));
				
		//Planejamento
//		PlanejamentoUc planejamentoUc1 = new PlanejamentoUc(null, "Planejamento 1", null, true, grupo1);
//		planejamentoUcRepository.saveAll(Arrays.asList(planejamentoUc1));
		
		//participante
		Participante participante1 = new Participante(null, null, true, grupo1, estudante1);
		participanteRepository.saveAll(Arrays.asList(participante1));
		
		//badge_nivel
//		BadgeNivel nivel1 = new BadgeNivel(null, "nivel 1");
//		badgeNivelRepository.saveAll(Arrays.asList(nivel1));

		//badge
//		Badge badge1 = new Badge(null, "teste", null, true, nivel1);
//		Badge badge2 = new Badge(null, "teste", null, true, nivel1);
//		Badge badge3 = new Badge(null, "teste", null, true, nivel1);
//		badgeRepository.saveAll(Arrays.asList(badge1, badge2, badge3));
		
		//grau_dificuldade
//		GrauDificuldade grau1 = new GrauDificuldade(null, "Fácil", true);
//		GrauDificuldade grau2 = new GrauDificuldade(null, "Intermediário", true);
//		GrauDificuldade grau3 = new GrauDificuldade(null, "Dificil", true);
//		grauDificuldadeRepository.saveAll(Arrays.asList(grau1, grau2, grau3));
		
		//dia_letivo
		DiaLetivo diaLetivo1 = new DiaLetivo(null, null, 1, 2, 3, 4, 5, periodo1);
		diaLetivoRepository.saveAll(Arrays.asList(diaLetivo1));
		
		//encontro_tipo
//		EncontroTipo encontroTipo1 = new EncontroTipo(null, "Aula 1", true);
//		EncontroTipo encontroTipo2 = new EncontroTipo(null, "Aula 2", true);
//		EncontroTipo encontroTipo3 = new EncontroTipo(null, "Aula 3", true);
//		encontroTipoRepository.saveAll(Arrays.asList(encontroTipo1, encontroTipo2, encontroTipo3));
		
		//encontro
//		Encontro encontro1 = new Encontro(null, "Aula 1", diaLetivo1, grupo1, null, null, "Sala 306", true, encontroTipo1);
//		encontroRepository.saveAll(Arrays.asList(encontro1));
		
		//situacao_aprendizagem
//		List<CompetenciaIndicador> indicadores = new ArrayList<>();
//		indicadores.add(ind1);
//		List<CompetenciaIndicador> indicadores2 = new ArrayList<>();
//		indicadores2.add(ind1);
//		indicadores2.add(ind2);
//		SituacaoAprendizagem st1 = new SituacaoAprendizagem(null, "Situacao 1", "Descricao", 1, true, planejamentoUc1, grau1, badge1, indicadores);
//		SituacaoAprendizagem st2 = new SituacaoAprendizagem(null, "Situacao 1", "Descricao", 1, true, planejamentoUc1, grau1, badge1, indicadores2);
//		situacaoAprendizagemRepository.saveAll(Arrays.asList(st1, st2));
		
		//objeto_aprendizagem
		
		
	}
}
