/**
 * EnviarTituloResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.aaf.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnviarTituloResponse  {

	private DevedorEnviar devedor;

    private DividaEnviar divida;

    private StatusResponse resposta;

    public EnviarTituloResponse() {
    }

    public EnviarTituloResponse(
           DevedorEnviar devedor,
           DividaEnviar divida,
           StatusResponse resposta) {
           this.setDevedor(devedor);
           this.setDivida(divida);
           this.setResposta(resposta);
    }

	public DevedorEnviar getDevedor() {
		return devedor;
	}

	public void setDevedor(DevedorEnviar devedor) {
		this.devedor = devedor;
	}

	public DividaEnviar getDivida() {
		return divida;
	}

	public void setDivida(DividaEnviar divida) {
		this.divida = divida;
	}

	public StatusResponse getResposta() {
		return resposta;
	}

	public void setResposta(StatusResponse resposta) {
		this.resposta = resposta;
	}


   

}
