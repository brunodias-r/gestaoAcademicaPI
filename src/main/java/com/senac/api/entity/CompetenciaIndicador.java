package com.senac.api.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "copetencia_indicador")
public class CompetenciaIndicador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "competencia_indicador_id")
	private Long id;
	@Column(name = "competencia_indicador_descricao")
	private String descricao;
	@Column(name = "competencia_indicador_status")
	private Integer status;
//	@ManyToOne
//	@JoinColumn(name = "competencia_id", referencedColumnName = "copetencia_id")
	@Column(name = "competencia_id")
	private Long competenciaId;
//	@JsonIgnore
//	@ManyToMany(mappedBy = "indicadores")
	private Long situacaoAprendizgemId;

	public CompetenciaIndicador() {
		super();
	}

	public CompetenciaIndicador(Long id, String descricao, Integer status, Long copetenciaId) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.competenciaId = competenciaId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getCompetenciaId() {
		return competenciaId;
	}

	public void setCompetenciaId(Long competenciaId) {
		this.competenciaId = competenciaId;
	}

	public Long getSituacaoAprendizgemId() {
		return situacaoAprendizgemId;
	}

	public void setSituacaoAprendizgemId(Long situacaoAprendizgemId) {
		this.situacaoAprendizgemId = situacaoAprendizgemId;
	}

}
