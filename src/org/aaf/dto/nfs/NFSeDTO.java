package org.aaf.dto.nfs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="nfse")
@XmlType (propOrder={"teste","nf","prestador","tomador","itens","produtos"})
public class NFSeDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String teste;
	
	private NF nf;
	
	private PrestadorNFS prestador;
	
	private TomadorNFS tomador;
	
	private ItemNFS itens;
	
	private String produtos="";

	public NFSeDTO() {
	}
	
	@XmlElement  
	public NF getNf() {
		return nf;
	}

	@XmlElement  
	public PrestadorNFS getPrestador() {
		return prestador;
	}
	
	@XmlElement 
	public TomadorNFS getTomador() {
		return tomador;
	}
	
	@XmlElement 
	public ItemNFS getItens() {
		return itens;
	}
	
	@XmlElement 
	public String getProdutos() {
		return produtos;
	}

	public void setPrestador(PrestadorNFS prestador) {
		this.prestador = prestador;
	}

	public void setNf(NF nf) {
		this.nf = nf;
	}

	public void setTomador(TomadorNFS tomador) {
		this.tomador = tomador;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public void setItens(ItemNFS itens) {
		this.itens = itens;
	}

	@XmlElement(name="nfse_teste") 
	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
}