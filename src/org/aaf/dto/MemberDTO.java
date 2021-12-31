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

	private String cpf;

	private String rg;

	private String cep;

	private String endereco;

	private String bairro;

	private String cidade;
	
	private String contatoEmail1;
    
    private String contatoEmail2;
	
    private String contatoTelefone1;

    private String contatoTelefone2;
    
    private String contatoTelefone3;
    
    private String contatoTelefone4;
    
    private String contatoTelefone5;
    
    private byte[] foto;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getContatoEmail1() {
		return contatoEmail1;
	}

	public void setContatoEmail1(String contatoEmail1) {
		this.contatoEmail1 = contatoEmail1;
	}

	public String getContatoEmail2() {
		return contatoEmail2;
	}

	public void setContatoEmail2(String contatoEmail2) {
		this.contatoEmail2 = contatoEmail2;
	}

	public String getContatoTelefone1() {
		return contatoTelefone1;
	}

	public void setContatoTelefone1(String contatoTelefone1) {
		this.contatoTelefone1 = contatoTelefone1;
	}

	public String getContatoTelefone2() {
		return contatoTelefone2;
	}

	public void setContatoTelefone2(String contatoTelefone2) {
		this.contatoTelefone2 = contatoTelefone2;
	}

	public String getContatoTelefone3() {
		return contatoTelefone3;
	}

	public void setContatoTelefone3(String contatoTelefone3) {
		this.contatoTelefone3 = contatoTelefone3;
	}

	public String getContatoTelefone4() {
		return contatoTelefone4;
	}

	public void setContatoTelefone4(String contatoTelefone4) {
		this.contatoTelefone4 = contatoTelefone4;
	}

	public String getContatoTelefone5() {
		return contatoTelefone5;
	}

	public void setContatoTelefone5(String contatoTelefone5) {
		this.contatoTelefone5 = contatoTelefone5;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}