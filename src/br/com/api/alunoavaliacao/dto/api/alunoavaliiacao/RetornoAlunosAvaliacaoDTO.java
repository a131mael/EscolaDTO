package br.com.api.alunoavaliacao.dto.api.alunoavaliiacao;

import java.io.Serializable;
import java.util.List;

public class RetornoAlunosAvaliacaoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<AlunoAvaliacaoDTO> alunosAvaliacao;

	private String codigo;
	
	public List<AlunoAvaliacaoDTO> getAlunosAvaliacao() {
		return alunosAvaliacao;
	}

	public void setAlunosAvaliacao(List<AlunoAvaliacaoDTO> alunosAvaliacao) {
		this.alunosAvaliacao = alunosAvaliacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
