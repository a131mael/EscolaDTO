/**
 * DividaEnviar.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.aaf.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DividaEnviar  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String especie;

    private java.lang.String numero;

    private java.lang.String nossoNumero;

    private java.lang.String valor;

    private java.lang.String saldo;

    private java.lang.String tipoEndosso;

    private java.lang.String aceite;

    private java.lang.String finsFalimentares;

    private java.lang.String declaracaoPortador;

    private java.lang.String emissao;

    private java.lang.String vencimento;

    private java.lang.String pracaManual;

    private java.lang.String anotacao;

    public DividaEnviar() {
    }

    public DividaEnviar(
           java.lang.String especie,
           java.lang.String numero,
           java.lang.String nossoNumero,
           java.lang.String valor,
           java.lang.String saldo,
           java.lang.String tipoEndosso,
           java.lang.String aceite,
           java.lang.String finsFalimentares,
           java.lang.String declaracaoPortador,
           java.lang.String emissao,
           java.lang.String vencimento,
           java.lang.String pracaManual,
           java.lang.String anotacao) {
           this.especie = especie;
           this.numero = numero;
           this.nossoNumero = nossoNumero;
           this.valor = valor;
           this.saldo = saldo;
           this.tipoEndosso = tipoEndosso;
           this.aceite = aceite;
           this.finsFalimentares = finsFalimentares;
           this.declaracaoPortador = declaracaoPortador;
           this.emissao = emissao;
           this.vencimento = vencimento;
           this.pracaManual = pracaManual;
           this.anotacao = anotacao;
    }


    /**
     * Gets the especie value for this DividaEnviar.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this DividaEnviar.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }


    /**
     * Gets the numero value for this DividaEnviar.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this DividaEnviar.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the nossoNumero value for this DividaEnviar.
     * 
     * @return nossoNumero
     */
    public java.lang.String getNossoNumero() {
        return nossoNumero;
    }


    /**
     * Sets the nossoNumero value for this DividaEnviar.
     * 
     * @param nossoNumero
     */
    public void setNossoNumero(java.lang.String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }


    /**
     * Gets the valor value for this DividaEnviar.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this DividaEnviar.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the saldo value for this DividaEnviar.
     * 
     * @return saldo
     */
    public java.lang.String getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this DividaEnviar.
     * 
     * @param saldo
     */
    public void setSaldo(java.lang.String saldo) {
        this.saldo = saldo;
    }


    /**
     * Gets the tipoEndosso value for this DividaEnviar.
     * 
     * @return tipoEndosso
     */
    public java.lang.String getTipoEndosso() {
        return tipoEndosso;
    }


    /**
     * Sets the tipoEndosso value for this DividaEnviar.
     * 
     * @param tipoEndosso
     */
    public void setTipoEndosso(java.lang.String tipoEndosso) {
        this.tipoEndosso = tipoEndosso;
    }


    /**
     * Gets the aceite value for this DividaEnviar.
     * 
     * @return aceite
     */
    public java.lang.String getAceite() {
        return aceite;
    }


    /**
     * Sets the aceite value for this DividaEnviar.
     * 
     * @param aceite
     */
    public void setAceite(java.lang.String aceite) {
        this.aceite = aceite;
    }


    /**
     * Gets the finsFalimentares value for this DividaEnviar.
     * 
     * @return finsFalimentares
     */
    public java.lang.String getFinsFalimentares() {
        return finsFalimentares;
    }


    /**
     * Sets the finsFalimentares value for this DividaEnviar.
     * 
     * @param finsFalimentares
     */
    public void setFinsFalimentares(java.lang.String finsFalimentares) {
        this.finsFalimentares = finsFalimentares;
    }


    /**
     * Gets the declaracaoPortador value for this DividaEnviar.
     * 
     * @return declaracaoPortador
     */
    public java.lang.String getDeclaracaoPortador() {
        return declaracaoPortador;
    }


    /**
     * Sets the declaracaoPortador value for this DividaEnviar.
     * 
     * @param declaracaoPortador
     */
    public void setDeclaracaoPortador(java.lang.String declaracaoPortador) {
        this.declaracaoPortador = declaracaoPortador;
    }


    /**
     * Gets the emissao value for this DividaEnviar.
     * 
     * @return emissao
     */
    public java.lang.String getEmissao() {
        return emissao;
    }


    /**
     * Sets the emissao value for this DividaEnviar.
     * 
     * @param emissao
     */
    public void setEmissao(java.lang.String emissao) {
        this.emissao = emissao;
    }


    /**
     * Gets the vencimento value for this DividaEnviar.
     * 
     * @return vencimento
     */
    public java.lang.String getVencimento() {
        return vencimento;
    }


    /**
     * Sets the vencimento value for this DividaEnviar.
     * 
     * @param vencimento
     */
    public void setVencimento(java.lang.String vencimento) {
        this.vencimento = vencimento;
    }
   
    /**
     * Gets the pracaManual value for this DividaEnviar.
     * 
     * @return pracaManual
     */
    public java.lang.String getPracaManual() {
        return pracaManual;
    }


    /**
     * Sets the pracaManual value for this DividaEnviar.
     * 
     * @param pracaManual
     */
    public void setPracaManual(java.lang.String pracaManual) {
        this.pracaManual = pracaManual;
    }


    /**
     * Gets the anotacao value for this DividaEnviar.
     * 
     * @return anotacao
     */
    public java.lang.String getAnotacao() {
        return anotacao;
    }


    /**
     * Sets the anotacao value for this DividaEnviar.
     * 
     * @param anotacao
     */
    public void setAnotacao(java.lang.String anotacao) {
        this.anotacao = anotacao;
    }

    

    

}
