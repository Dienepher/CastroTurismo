package br.com.dienepher.domain.Equipagento;

import java.io.Serializable;

/**
 * classe que recebeos dados de onibus
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Onibus extends Veiculos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer poltrona;
	private Veiculos veiculos;
	public Onibus() {
		super();
	}
	/**
	 * @return the poltrona
	 */
	public Integer getPoltrona() {
		return poltrona;
	}
	/**
	 * @param poltrona the poltrona to set
	 */
	public void setPoltrona(Integer poltrona) {
		this.poltrona = poltrona;
	}
	/**
	 * @return the veiculos
	 */
	public Veiculos getVeiculos() {
		return veiculos;
	}
	/**
	 * @param veiculos the veiculos to set
	 */
	public void setVeiculos(Veiculos veiculos) {
		this.veiculos = veiculos;
	}


}
