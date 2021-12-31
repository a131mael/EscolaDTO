package org.aaf.dto;

import java.io.Serializable;

public class AlunoAulaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private AlunoDTO aluno;
	
	private AulaDTO aula;
	
	private Boolean assistiu;

	public AlunoAulaDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public AlunoDTO getAluno() {
		return aluno;
	}

	public void setAluno(AlunoDTO aluno) {
		this.aluno = aluno;
	}

	public AulaDTO getAula() {
		return aula;
	}

	public void setAula(AulaDTO aula) {
		this.aula = aula;
	}

	public Boolean getAssistiu() {
		return assistiu;
	}

	public void setAssistiu(Boolean assistiu) {
		this.assistiu = assistiu;
	}

}