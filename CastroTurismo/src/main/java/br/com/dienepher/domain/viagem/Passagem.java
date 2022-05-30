package br.com.dienepher.domain.viagem;

import java.io.Serializable;

/**
 * classe que recebeos dados de passagem
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Passagem implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer numeroPassagem;
private	Integer nulmeroPoltrona;
private	Boolean possuiBagagem;
private	String formaDePagamento;


public Passagem() {
	super();
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((formaDePagamento == null) ? 0 : formaDePagamento.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((nulmeroPoltrona == null) ? 0 : nulmeroPoltrona.hashCode());
	result = prime * result + ((numeroPassagem == null) ? 0 : numeroPassagem.hashCode());
	result = prime * result + ((possuiBagagem == null) ? 0 : possuiBagagem.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Passagem other = (Passagem) obj;
	if (formaDePagamento == null) {
		if (other.formaDePagamento != null)
			return false;
	} else if (!formaDePagamento.equals(other.formaDePagamento))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (nulmeroPoltrona == null) {
		if (other.nulmeroPoltrona != null)
			return false;
	} else if (!nulmeroPoltrona.equals(other.nulmeroPoltrona))
		return false;
	if (numeroPassagem == null) {
		if (other.numeroPassagem != null)
			return false;
	} else if (!numeroPassagem.equals(other.numeroPassagem))
		return false;
	if (possuiBagagem == null) {
		if (other.possuiBagagem != null)
			return false;
	} else if (!possuiBagagem.equals(other.possuiBagagem))
		return false;
	return true;
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}


@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}


@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}


/**
 * @return the id
 */
public Integer getId() {
	return id;
}


/**
 * @param id the id to set
 */
public void setId(Integer id) {
	this.id = id;
}


/**
 * @return the numeroPassagem
 */
public Integer getNumeroPassagem() {
	return numeroPassagem;
}


/**
 * @param numeroPassagem the numeroPassagem to set
 */
public void setNumeroPassagem(Integer numeroPassagem) {
	this.numeroPassagem = numeroPassagem;
}


/**
 * @return the nulmeroPoltrona
 */
public Integer getNulmeroPoltrona() {
	return nulmeroPoltrona;
}


/**
 * @param nulmeroPoltrona the nulmeroPoltrona to set
 */
public void setNulmeroPoltrona(Integer nulmeroPoltrona) {
	this.nulmeroPoltrona = nulmeroPoltrona;
}


/**
 * @return the possuiBagagem
 */
public Boolean getPossuiBagagem() {
	return possuiBagagem;
}


/**
 * @param possuiBagagem the possuiBagagem to set
 */
public void setPossuiBagagem(Boolean possuiBagagem) {
	this.possuiBagagem = possuiBagagem;
}


/**
 * @return the formaDePagamento
 */
public String getFormaDePagamento() {
	return formaDePagamento;
}


/**
 * @param formaDePagamento the formaDePagamento to set
 */
public void setFormaDePagamento(String formaDePagamento) {
	this.formaDePagamento = formaDePagamento;
}


}
