package br.com.dienepher.domain.Equipagento;

import java.io.Serializable;

/**
 * classe que recebeos dados de onibus
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Carro extends Veiculos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
private String setor;

private Veiculos veiculos;

public Carro() {
	super();
}

/**
 * @return the setor
 */
public String getSetor() {
	return setor;
}

/**
 * @param setor the setor to set
 */
public void setSetor(String setor) {
	this.setor = setor;
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
