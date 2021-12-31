package org.aaf.dto.nfs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "nf")
@XmlType (propOrder={"valor_total","valor_desconto","valor_ir","valor_inss",
		"valor_contribuicao_social","valor_rps","valor_pis","valor_cofins","observacao" })
public class NF implements Serializable {

	private static final long serialVersionUID = 1L;

	private String valor_total = "100,00";
	private String valor_desconto = "0,00";
	private String valor_ir = "0,00";
	private String valor_inss = "0,00";
	private String valor_contribuicao_social = "0,00";
	private String valor_rps = "0,00";
	private String valor_pis = "0,00";
	private String valor_cofins = "0,00";
	private String observacao ="";

	public NF() {
	}

	@XmlElement
	public String getValor_total() {
		return valor_total;
	}

	public void setValor_total(String valor_total) {
		this.valor_total = valor_total;
	}

	@XmlElement
	public String getValor_desconto() {
		return valor_desconto;
	}

	public void setValor_desconto(String valor_desconto) {
		this.valor_desconto = valor_desconto;
	}

	@XmlElement
	public String getValor_ir() {
		return valor_ir;
	}

	public void setValor_ir(String valor_ir) {
		this.valor_ir = valor_ir;
	}

	@XmlElement
	public String getValor_inss() {
		return valor_inss;
	}

	public void setValor_inss(String valor_inss) {
		this.valor_inss = valor_inss;
	}

	@XmlElement
	public String getValor_contribuicao_social() {
		return valor_contribuicao_social;
	}

	public void setValor_contribuicao_social(String valor_contribuicao_social) {
		this.valor_contribuicao_social = valor_contribuicao_social;
	}

	@XmlElement
	public String getValor_rps() {
		return valor_rps;
	}

	public void setValor_rps(String valor_rps) {
		this.valor_rps = valor_rps;
	}

	@XmlElement
	public String getValor_pis() {
		return valor_pis;
	}

	public void setValor_pis(String valor_pis) {
		this.valor_pis = valor_pis;
	}

	@XmlElement
	public String getValor_cofins() {
		return valor_cofins;
	}

	public void setValor_cofins(String valor_cofins) {
		this.valor_cofins = valor_cofins;
	}

	@XmlElement
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}