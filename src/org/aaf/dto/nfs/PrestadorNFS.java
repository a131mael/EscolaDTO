package org.aaf.dto.nfs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="prestador")
public class PrestadorNFS implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cpfcnpj = "14395954000155";
	private String cidade = "8233";

	public PrestadorNFS() {
	}

	@XmlElement 
	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public void setCpfcnpj(String cpfcnpj) {
		this.cpfcnpj = cpfcnpj;
	}

	@XmlElement 
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}