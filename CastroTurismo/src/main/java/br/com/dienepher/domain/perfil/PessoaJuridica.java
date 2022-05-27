package br.com.dienepher.domain.perfil;

import java.io.Serializable;

/**
 * classe que recebeos dados de pessoaJuridica
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */
public class PessoaJuridica  extends Pessoa implements Serializable {
	
	private Integer CNPJ;
	private Integer InscricaoEstdual;
	
private Pessoa pessoa;
	
	public PessoaJuridica() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		result = prime * result + ((InscricaoEstdual == null) ? 0 : InscricaoEstdual.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		PessoaJuridica other = (PessoaJuridica) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		if (InscricaoEstdual == null) {
			if (other.InscricaoEstdual != null)
				return false;
		} else if (!InscricaoEstdual.equals(other.InscricaoEstdual))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
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

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public Integer getNumero() {
		// TODO Auto-generated method stub
		return super.getNumero();
	}

	@Override
	public void setNumero(Integer numero) {
		// TODO Auto-generated method stub
		super.setNumero(numero);
	}

	/**
	 * @return the cNPJ
	 */
	public Integer getCNPJ() {
		return CNPJ;
	}

	/**
	 * @param cNPJ the cNPJ to set
	 */
	public void setCNPJ(Integer cNPJ) {
		CNPJ = cNPJ;
	}

	/**
	 * @return the inscricaoEstdual
	 */
	public Integer getInscricaoEstdual() {
		return InscricaoEstdual;
	}

	/**
	 * @param inscricaoEstdual the inscricaoEstdual to set
	 */
	public void setInscricaoEstdual(Integer inscricaoEstdual) {
		InscricaoEstdual = inscricaoEstdual;
	}

	/**
	 * @return the pessoa
	 */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/**
	 * @param pessoa the pessoa to set
	 */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
