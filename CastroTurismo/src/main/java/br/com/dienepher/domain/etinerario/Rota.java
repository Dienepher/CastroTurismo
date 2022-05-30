package br.com.dienepher.domain.etinerario;

import java.io.Serializable;

import br.com.dienepher.domain.perfil.Pessoa;

/**
 * classe que recebeos dados de pessoaJuridica
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Rota extends Rodoviaria implements Serializable   {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Rodovia origem;
	private Rodovia destino;
	private Real quilometragem;
	private Real precoPassagem;
	
private Rodovia rodovia;
	
	public Rota() {
		super();
	}
}
