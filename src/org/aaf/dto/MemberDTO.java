package org.aaf.dto;

import java.io.Serializable;

import org.json.JSONObject;

public class MemberDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String cod;

	private String email;

	private String login;

	private String senha;
	
	private int tipoMembro;
	
	private String tokenFCM;
	
	private String telefone;
	
	private String idCrianca1;
	
	private String idCrianca2;

	private String idCrianca3;
	
	private String idCrianca4;
	
	private String idCrianca5;

	public MemberDTO() {
	}

	@SuppressWarnings("deprecation")
	public MemberDTO(JSONObject json) {
		if (json != null) {
			this.id = !json.isNull("id") ? json.getLong("id") : null;
			this.name = !json.isNull("id") ? json.getString("name") : null;
			this.cod = !json.isNull("id") ? json.getString("cod") : null;
			this.email = !json.isNull("id") ? json.getString("email") : null;
			this.login = !json.isNull("id") ? json.getString("login") : null;
			this.senha = !json.isNull("id") ? json.getString("senha") : null;
		}
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		final MemberDTO other = (MemberDTO) obj;
		if (this.getId() != other.getId() && (this.id == null || !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTipoMembro() {
		return tipoMembro;
	}

	public void setTipoMembro(int tipoMembro) {
		this.tipoMembro = tipoMembro;
	}

	public String getTokenFCM() {
		return tokenFCM;
	}

	public void setTokenFCM(String tokenFCM) {
		this.tokenFCM = tokenFCM;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIdCrianca1() {
		return idCrianca1;
	}

	public void setIdCrianca1(String idCrianca1) {
		this.idCrianca1 = idCrianca1;
	}

	public String getIdCrianca2() {
		return idCrianca2;
	}

	public void setIdCrianca2(String idCrianca2) {
		this.idCrianca2 = idCrianca2;
	}

	public String getIdCrianca3() {
		return idCrianca3;
	}

	public void setIdCrianca3(String idCrianca3) {
		this.idCrianca3 = idCrianca3;
	}

	public String getIdCrianca4() {
		return idCrianca4;
	}

	public void setIdCrianca4(String idCrianca4) {
		this.idCrianca4 = idCrianca4;
	}

	public String getIdCrianca5() {
		return idCrianca5;
	}

	public void setIdCrianca5(String idCrianca5) {
		this.idCrianca5 = idCrianca5;
	}

}