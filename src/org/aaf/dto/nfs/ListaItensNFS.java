package org.aaf.dto.nfs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="lista")
@XmlType (propOrder={"codigo_local_prestacao_servico","codigo_item_lista_servico","descritivo","aliquota_item_lista_servico",
		"situacao_tributaria","valor_tributavel","valor_deducao","valor_issrf","tributa_municipio_prestador"
		,"unidade_codigo","unidade_quantidade","unidade_valor_unitario"})
public class ListaItensNFS implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo_local_prestacao_servico="8233";
	private String codigo_item_lista_servico ="801";
	private String descritivo="serviço de educação em pre escola";
	private String aliquota_item_lista_servico="2,0100";
	private String situacao_tributaria="00";
	private String valor_tributavel;
	private String valor_deducao="0,00";
	private String valor_issrf="0,00";
	private String tributa_municipio_prestador="S";
	private String unidade_codigo="1";
	private String unidade_quantidade ="1,00";
	private String unidade_valor_unitario="";
	
	public String getCodigo_local_prestacao_servico() {
		return codigo_local_prestacao_servico;
	}
	public void setCodigo_local_prestacao_servico(String codigo_local_prestacao_servico) {
		this.codigo_local_prestacao_servico = codigo_local_prestacao_servico;
	}
	public String getCodigo_item_lista_servico() {
		return codigo_item_lista_servico;
	}
	public void setCodigo_item_lista_servico(String codigo_item_lista_servico) {
		this.codigo_item_lista_servico = codigo_item_lista_servico;
	}
	public String getDescritivo() {
		return descritivo;
	}
	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}
	public String getAliquota_item_lista_servico() {
		return aliquota_item_lista_servico;
	}
	public void setAliquota_item_lista_servico(String aliquota_item_lista_servico) {
		this.aliquota_item_lista_servico = aliquota_item_lista_servico;
	}
	public String getSituacao_tributaria() {
		return situacao_tributaria;
	}
	public void setSituacao_tributaria(String situacao_tributaria) {
		this.situacao_tributaria = situacao_tributaria;
	}
	public String getValor_tributavel() {
		return valor_tributavel;
	}
	public void setValor_tributavel(String valor_tributavel) {
		this.valor_tributavel = valor_tributavel;
	}
	public String getValor_deducao() {
		return valor_deducao;
	}
	public void setValor_deducao(String valor_deducao) {
		this.valor_deducao = valor_deducao;
	}
	public String getValor_issrf() {
		return valor_issrf;
	}
	public void setValor_issrf(String valor_issrf) {
		this.valor_issrf = valor_issrf;
	}
	public String getTributa_municipio_prestador() {
		return tributa_municipio_prestador;
	}
	public void setTributa_municipio_prestador(String tributa_municipio_prestador) {
		this.tributa_municipio_prestador = tributa_municipio_prestador;
	}
	public String getUnidade_codigo() {
		return unidade_codigo;
	}
	public void setUnidade_codigo(String unidade_codigo) {
		this.unidade_codigo = unidade_codigo;
	}
	public String getUnidade_quantidade() {
		return unidade_quantidade;
	}
	public void setUnidade_quantidade(String unidade_quantidade) {
		this.unidade_quantidade = unidade_quantidade;
	}
	public String getUnidade_valor_unitario() {
		return unidade_valor_unitario;
	}
	public void setUnidade_valor_unitario(String unidade_valor_unitario) {
		this.unidade_valor_unitario = unidade_valor_unitario;
	}

}