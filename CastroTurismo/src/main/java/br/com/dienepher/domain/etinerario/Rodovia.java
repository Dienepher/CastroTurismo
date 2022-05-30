package br.com.dienepher.domain.etinerario;

import java.io.Serializable;

import javax.security.sasl.RealmCallback;

import br.com.dienepher.domain.perfil.Pessoa;

/**
 * classe que recebeos dados de pessoaJuridica
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Rodovia extends PessoaJuridica implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String HoraAbertura;
	private String HoraFexamento;
	private Real TaxaDeEmbarque;
	private PessoaJuridica pessoajuridica;
	
	public Rodovia() {
		super();
	}

	/**
	 * @return the horaAbertura
	 */
	public String getHoraAbertura() {
		return HoraAbertura;
	}

	/**
	 * @param horaAbertura the horaAbertura to set
	 */
	public void setHoraAbertura(String horaAbertura) {
		HoraAbertura = horaAbertura;
	}

	/**
	 * @return the horaFexamento
	 */
	public String getHoraFexamento() {
		return HoraFexamento;
	}

	/**
	 * @param horaFexamento the horaFexamento to set
	 */
	public void setHoraFexamento(String horaFexamento) {
		HoraFexamento = horaFexamento;
	}

	/**
	 * @return the taxaDeEmbarque
	 */
	public Real getTaxaDeEmbarque() {
		return TaxaDeEmbarque;
	}

	/**
	 * @param taxaDeEmbarque the taxaDeEmbarque to set
	 */
	public void setTaxaDeEmbarque(Real taxaDeEmbarque) {
		TaxaDeEmbarque = taxaDeEmbarque;
	}

	/**
	 * @return the pessoajuridica
	 */
	public PessoaJuridica getPessoajuridica() {
		return pessoajuridica;
	}

	/**
	 * @param pessoajuridica the pessoajuridica to set
	 */
	public void setPessoajuridica(PessoaJuridica pessoajuridica) {
		this.pessoajuridica = pessoajuridica;
	}
	
	
}
