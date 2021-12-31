package org.aaf.dto.nfs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="item")
public class ItemNFS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ListaItensNFS lista;

	public ListaItensNFS getLista() {
		return lista;
	}

	public void setLista(ListaItensNFS lista) {
		this.lista = lista;
	}
	

}