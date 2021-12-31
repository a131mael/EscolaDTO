package org.aaf.dto;

import java.io.Serializable;

public class AlunoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nomeAluno;

	private String codigo;
	
	private String serie;
	
	private String periodo;
	
	private String professor;
	
	private String contatoEmail1;

	private String contatoEmail2;

	private String contatoTelefone1;

	private String contatoNome1;

	private String contatoTelefone2;

	private String contatoNome2;

	private String contatoTelefone3;

	private String contatoNome3;

	private String contatoTelefone4;

	private String contatoNome4;

	private String contatoTelefone5;

	private String contatoNome5;
	
	private String autorizadoASairCom1;
	
	private String autorizadoASairCom2;
	
	private String autorizadoASairCom3;
	
	private String autorizadoASairCom4;
	
	private String autorizadoASairCom5;
	
	private String autorizadoASairCom6;
	
	private String autorizadoASairCom7;
	
	private byte[] foto;
	
	public AlunoDTO() {
	}
 
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 11 * hash + (this.getId() != null ? this.getId().hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		final AlunoDTO other = (AlunoDTO) obj;
		if (this.getId() != other.getId() && (this.getId() == null || !this.getId().equals(other.id))) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getAutorizadoASairCom7() {
		return autorizadoASairCom7;
	}

	public void setAutorizadoASairCom7(String autorizadoASairCom7) {
		this.autorizadoASairCom7 = autorizadoASairCom7;
	}

	public String getAutorizadoASairCom6() {
		return autorizadoASairCom6;
	}

	public void setAutorizadoASairCom6(String autorizadoASairCom6) {
		this.autorizadoASairCom6 = autorizadoASairCom6;
	}

	public String getAutorizadoASairCom5() {
		return autorizadoASairCom5;
	}

	public void setAutorizadoASairCom5(String autorizadoASairCom5) {
		this.autorizadoASairCom5 = autorizadoASairCom5;
	}

	public String getAutorizadoASairCom4() {
		return autorizadoASairCom4;
	}

	public void setAutorizadoASairCom4(String autorizadoASairCom4) {
		this.autorizadoASairCom4 = autorizadoASairCom4;
	}

	public String getAutorizadoASairCom3() {
		return autorizadoASairCom3;
	}

	public void setAutorizadoASairCom3(String autorizadoASairCom3) {
		this.autorizadoASairCom3 = autorizadoASairCom3;
	}

	public String getAutorizadoASairCom2() {
		return autorizadoASairCom2;
	}

	public void setAutorizadoASairCom2(String autorizadoASairCom2) {
		this.autorizadoASairCom2 = autorizadoASairCom2;
	}

	public String getAutorizadoASairCom1() {
		return autorizadoASairCom1;
	}

	public void setAutorizadoASairCom1(String autorizadoASairCom1) {
		this.autorizadoASairCom1 = autorizadoASairCom1;
	}

	public String getContatoNome5() {
		return contatoNome5;
	}

	public void setContatoNome5(String contatoNome5) {
		this.contatoNome5 = contatoNome5;
	}

	public String getContatoTelefone5() {
		return contatoTelefone5;
	}

	public void setContatoTelefone5(String contatoTelefone5) {
		this.contatoTelefone5 = contatoTelefone5;
	}

	public String getContatoNome4() {
		return contatoNome4;
	}

	public void setContatoNome4(String contatoNome4) {
		this.contatoNome4 = contatoNome4;
	}

	public String getContatoTelefone4() {
		return contatoTelefone4;
	}

	public void setContatoTelefone4(String contatoTelefone4) {
		this.contatoTelefone4 = contatoTelefone4;
	}

	public String getContatoNome3() {
		return contatoNome3;
	}

	public void setContatoNome3(String contatoNome3) {
		this.contatoNome3 = contatoNome3;
	}

	public String getContatoTelefone3() {
		return contatoTelefone3;
	}

	public void setContatoTelefone3(String contatoTelefone3) {
		this.contatoTelefone3 = contatoTelefone3;
	}

	public String getContatoNome2() {
		return contatoNome2;
	}

	public void setContatoNome2(String contatoNome2) {
		this.contatoNome2 = contatoNome2;
	}

	public String getContatoTelefone2() {
		return contatoTelefone2;
	}

	public void setContatoTelefone2(String contatoTelefone2) {
		this.contatoTelefone2 = contatoTelefone2;
	}

	public String getContatoNome1() {
		return contatoNome1;
	}

	public void setContatoNome1(String contatoNome1) {
		this.contatoNome1 = contatoNome1;
	}

	public String getContatoTelefone1() {
		return contatoTelefone1;
	}

	public void setContatoTelefone1(String contatoTelefone1) {
		this.contatoTelefone1 = contatoTelefone1;
	}

	public String getContatoEmail2() {
		return contatoEmail2;
	}

	public void setContatoEmail2(String contatoEmail2) {
		this.contatoEmail2 = contatoEmail2;
	}

	public String getContatoEmail1() {
		return contatoEmail1;
	}

	public void setContatoEmail1(String contatoEmail1) {
		this.contatoEmail1 = contatoEmail1;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}