package org.aaf.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.spi.TimeZoneNameProvider;

public class RecadoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;
    
    private Date dataInicio;
    
    private Date dataFim;
    
    private String descricao;

    private String codigo;
    
    private boolean questionario;
    
    private boolean removido;
    
    private String opcao1;
    
    private String opcao2;
    
    private String opcao3;
    
    private String opcao4;
    
    private String opcao5;
    
    private String opcao6;
    
    private byte[] filePergunta;

	private byte[] filePerguntaUnder;

    private String respostaAberta;
    
    private String descricaoUnder;

	private int fontSizeQuestion;

	private boolean bigQuestion;
	
	private boolean respostaBooleana;
	
	private int tipoDestinatario;
    
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
       
        final RecadoDTO other = (RecadoDTO) obj;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean isQuestionario() {
		return questionario;
	}

	public void setQuestionario(boolean questionario) {
		this.questionario = questionario;
	}

	public boolean isRemovido() {
		return removido;
	}

	public void setRemovido(boolean removido) {
		this.removido = removido;
	}

	public String getOpcao1() {
		return opcao1;
	}

	public void setOpcao1(String opcao1) {
		this.opcao1 = opcao1;
	}

	public String getOpcao2() {
		return opcao2;
	}

	public void setOpcao2(String opcao2) {
		this.opcao2 = opcao2;
	}

	public String getOpcao3() {
		return opcao3;
	}

	public void setOpcao3(String opcao3) {
		this.opcao3 = opcao3;
	}

	public String getOpcao4() {
		return opcao4;
	}

	public void setOpcao4(String opcao4) {
		this.opcao4 = opcao4;
	}

	public String getOpcao5() {
		return opcao5;
	}

	public void setOpcao5(String opcao5) {
		this.opcao5 = opcao5;
	}

	public String getOpcao6() {
		return opcao6;
	}

	public void setOpcao6(String opcao6) {
		this.opcao6 = opcao6;
	}

	public byte[] getFilePergunta() {
		return filePergunta;
	}

	public void setFilePergunta(byte[] filePergunta) {
		this.filePergunta = filePergunta;
	}

	public byte[] getFilePerguntaUnder() {
		return filePerguntaUnder;
	}

	public void setFilePerguntaUnder(byte[] filePerguntaUnder) {
		this.filePerguntaUnder = filePerguntaUnder;
	}

	public String getRespostaAberta() {
		return respostaAberta;
	}

	public void setRespostaAberta(String respostaAberta) {
		this.respostaAberta = respostaAberta;
	}

	public int getFontSizeQuestion() {
		return fontSizeQuestion;
	}

	public void setFontSizeQuestion(int fontSizeQuestion) {
		this.fontSizeQuestion = fontSizeQuestion;
	}

	public String getDescricaoUnder() {
		return descricaoUnder;
	}

	public void setDescricaoUnder(String descricaoUnder) {
		this.descricaoUnder = descricaoUnder;
	}

	public boolean isBigQuestion() {
		return bigQuestion;
	}

	public void setBigQuestion(boolean bigQuestion) {
		this.bigQuestion = bigQuestion;
	}

	public boolean isRespostaBooleana() {
		return respostaBooleana;
	}

	public void setRespostaBooleana(boolean respostaBooleana) {
		this.respostaBooleana = respostaBooleana;
	}

	public int getTipoDestinatario() {
		return tipoDestinatario;
	}

	public void setTipoDestinatario(int tipoDestinatario) {
		this.tipoDestinatario = tipoDestinatario;
	}
}