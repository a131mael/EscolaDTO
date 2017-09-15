package org.aaf.dto;

import java.io.Serializable;

public class RecadoDestinatarioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Long id;
    
    private RecadoDTO recado;
    
    private MemberDTO destinatario;
    
    private int resposta;
    
    private String respostaExtenso;

       
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
       
        final RecadoDestinatarioDTO other = (RecadoDestinatarioDTO) obj;
        if (this.getId() != other.getId() && (this.id == null || !this.id.equals(other.id))) {
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

	public RecadoDTO getRecado() {
		return recado;
	}

	public void setRecado(RecadoDTO recado) {
		this.recado = recado;
	}

	public MemberDTO getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(MemberDTO destinatario) {
		this.destinatario = destinatario;
	}

	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}

	public String getRespostaExtenso() {
		return respostaExtenso;
	}

	public void setRespostaExtenso(String respostaExtenso) {
		this.respostaExtenso = respostaExtenso;
	}

	
	
}