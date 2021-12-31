package org.aaf.dto.nfs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="nfse")
@XmlType (propOrder={"tipo","cpfcnpj","ie","nome_razao_social","sobrenome_nome_fantasia"
		,"logradouro","email","complemento","ponto_referencia","bairro","cidade"
		,"cep","ddd_fone_comercial","fone_comercial","ddd_fone_residencial","fone_residencial","ddd_fax","fone_fax"})
public class TomadorNFS implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipo = "F";
	private String cpfcnpj;
	private String ie = "";
	private String nome_razao_social;
	private String sobrenome_nome_fantasia;
	private String logradouro;
	private String email ;
	private String complemento;
	private String ponto_referencia = "";
	private String bairro;
	private String cidade;
	private String cep;
	private String ddd_fone_comercial = "";
	private String fone_comercial = "";
	private String ddd_fone_residencial = "";
	private String fone_residencial = "";
	private String ddd_fax = "";
	private String fone_fax = "";

	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCpfcnpj() {
		return cpfcnpj;
	}


	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}


	public String getIe() {
		return ie;
	}


	public void setIe(String ie) {
		this.ie = ie;
	}


	public String getNome_razao_social() {
		return nome_razao_social;
	}


	public void setNome_razao_social(String nome_razao_social) {
		this.nome_razao_social = nome_razao_social;
	}


	public String getSobrenome_nome_fantasia() {
		return sobrenome_nome_fantasia;
	}


	public void setSobrenome_nome_fantasia(String sobrenome_nome_fantasia) {
		this.sobrenome_nome_fantasia = sobrenome_nome_fantasia;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getPonto_referencia() {
		return ponto_referencia;
	}


	public void setPonto_referencia(String ponto_referencia) {
		this.ponto_referencia = ponto_referencia;
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


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getDdd_fone_comercial() {
		return ddd_fone_comercial;
	}


	public void setDdd_fone_comercial(String ddd_fone_comercial) {
		this.ddd_fone_comercial = ddd_fone_comercial;
	}


	public String getFone_comercial() {
		return fone_comercial;
	}


	public void setFone_comercial(String fone_comercial) {
		this.fone_comercial = fone_comercial;
	}


	public String getDdd_fone_residencial() {
		return ddd_fone_residencial;
	}


	public void setDdd_fone_residencial(String ddd_fone_residencial) {
		this.ddd_fone_residencial = ddd_fone_residencial;
	}


	public String getFone_residencial() {
		return fone_residencial;
	}


	public void setFone_residencial(String fone_residencial) {
		this.fone_residencial = fone_residencial;
	}


	public String getDdd_fax() {
		return ddd_fax;
	}


	public void setDdd_fax(String ddd_fax) {
		this.ddd_fax = ddd_fax;
	}


	public String getFone_fax() {
		return fone_fax;
	}


	public void setFone_fax(String fone_fax) {
		this.fone_fax = fone_fax;
	}


	public TomadorNFS() {
	}

	

}