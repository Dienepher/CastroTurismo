package br.com.dienepher.domain.perfil;

import java.io.Serializable;
import java.util.Date;

/**
 * classe que recebeos dados de PessoaFisica
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class PessoaFisica extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer CPF;
	private Integer RG;
	private String orgaoEmissor;
	private Date DataDeNascimento;
	
	public PessoaFisica() {
		super();
	}

	/**
	 * @return the cPF
	 */
	public Integer getCPF() {
		return CPF;
	}

	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	/**
	 * @return the rG
	 */
	public Integer getRG() {
		return RG;
	}

	/**
	 * @param rG the rG to set
	 */
	public void setRG(Integer rG) {
		RG = rG;
	}

	/**
	 * @return the orgaoEmissor
	 */
	public String getOrgaoEmissor() {
		return orgaoEmissor;
	}

	/**
	 * @param orgaoEmissor the orgaoEmissor to set
	 */
	public void setOrgaoEmissor(String orgaoEmissor) {
		this.orgaoEmissor = orgaoEmissor;
	}

	/**
	 * @return the dataDeNascimento
	 */
	public Date getDataDeNascimento() {
		return DataDeNascimento;
	}

	/**
	 * @param dataDeNascimento the dataDeNascimento to set
	 */
	public void setDataDeNascimento(Date dataDeNascimento) {
		DataDeNascimento = dataDeNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((DataDeNascimento == null) ? 0 : DataDeNascimento.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((orgaoEmissor == null) ? 0 : orgaoEmissor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (DataDeNascimento == null) {
			if (other.DataDeNascimento != null)
				return false;
		} else if (!DataDeNascimento.equals(other.DataDeNascimento))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (orgaoEmissor == null) {
			if (other.orgaoEmissor != null)
				return false;
		} else if (!orgaoEmissor.equals(other.orgaoEmissor))
			return false;
		return true;
	}


}
