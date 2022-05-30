package br.com.dienepher.domain.Equipagento;

import java.io.Serializable;

/**
 * classe que recebeos dados de veiculo
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Veiculo extends Seguradora implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer renavam;
	private Integer quilometragem;
	private String numeroDeEixos;
	private String placa;
	private String apolice;
	private Boolean seguro;
	
	private Seguradora seguradora;
	

	public Veiculo() {
		super();
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
	 * @return the renavam
	 */
	public Integer getRenavam() {
		return renavam;
	}


	/**
	 * @param renavam the renavam to set
	 */
	public void setRenavam(Integer renavam) {
		this.renavam = renavam;
	}


	/**
	 * @return the quilometragem
	 */
	public Integer getQuilometragem() {
		return quilometragem;
	}


	/**
	 * @param quilometragem the quilometragem to set
	 */
	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}


	/**
	 * @return the numeroDeEixos
	 */
	public String getNumeroDeEixos() {
		return numeroDeEixos;
	}


	/**
	 * @param numeroDeEixos the numeroDeEixos to set
	 */
	public void setNumeroDeEixos(String numeroDeEixos) {
		this.numeroDeEixos = numeroDeEixos;
	}


	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}


	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	/**
	 * @return the apolice
	 */
	public String getApolice() {
		return apolice;
	}


	/**
	 * @param apolice the apolice to set
	 */
	public void setApolice(String apolice) {
		this.apolice = apolice;
	}


	/**
	 * @return the seguro
	 */
	public Boolean getSeguro() {
		return seguro;
	}


	/**
	 * @param seguro the seguro to set
	 */
	public void setSeguro(Boolean seguro) {
		this.seguro = seguro;
	}


	/**
	 * @return the seguradora
	 */
	public Seguradora getSeguradora() {
		return seguradora;
	}


	/**
	 * @param seguradora the seguradora to set
	 */
	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

	
	
}
