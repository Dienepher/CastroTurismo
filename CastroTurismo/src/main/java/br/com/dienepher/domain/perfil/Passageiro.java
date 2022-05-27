package br.com.dienepher.domain.perfil;

import java.io.Serializable;

/**
 * classe que recebeos dados de passageiro
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Passageiro extends PessoaFisica implements Serializable  {
	
	private Integer numerocartao, seguranca;
	private String vencimento;
	
private PessoaFisica pessoafisica;
	
	public Passageiro() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((numerocartao == null) ? 0 : numerocartao.hashCode());
		result = prime * result + ((pessoafisica == null) ? 0 : pessoafisica.hashCode());
		result = prime * result + ((seguranca == null) ? 0 : seguranca.hashCode());
		result = prime * result + ((vencimento == null) ? 0 : vencimento.hashCode());
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
		Passageiro other = (Passageiro) obj;
		if (numerocartao == null) {
			if (other.numerocartao != null)
				return false;
		} else if (!numerocartao.equals(other.numerocartao))
			return false;
		if (pessoafisica == null) {
			if (other.pessoafisica != null)
				return false;
		} else if (!pessoafisica.equals(other.pessoafisica))
			return false;
		if (seguranca == null) {
			if (other.seguranca != null)
				return false;
		} else if (!seguranca.equals(other.seguranca))
			return false;
		if (vencimento == null) {
			if (other.vencimento != null)
				return false;
		} else if (!vencimento.equals(other.vencimento))
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

	@Override
	public Integer getCPF() {
		// TODO Auto-generated method stub
		return super.getCPF();
	}

	@Override
	public void setCPF(Integer cPF) {
		// TODO Auto-generated method stub
		super.setCPF(cPF);
	}

	@Override
	public Integer getRG() {
		// TODO Auto-generated method stub
		return super.getRG();
	}

	@Override
	public void setRG(Integer rG) {
		// TODO Auto-generated method stub
		super.setRG(rG);
	}

	@Override
	public String getOrgaoEmissor() {
		// TODO Auto-generated method stub
		return super.getOrgaoEmissor();
	}

	@Override
	public void setOrgaoEmissor(String orgaoEmissor) {
		// TODO Auto-generated method stub
		super.setOrgaoEmissor(orgaoEmissor);
	}

	@Override
	public Pessoa getPessoa() {
		// TODO Auto-generated method stub
		return super.getPessoa();
	}

	@Override
	public void setPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
		super.setPessoa(pessoa);
	}

	/**
	 * @return the numerocartao
	 */
	public Integer getNumerocartao() {
		return numerocartao;
	}

	/**
	 * @param numerocartao the numerocartao to set
	 */
	public void setNumerocartao(Integer numerocartao) {
		this.numerocartao = numerocartao;
	}

	/**
	 * @return the seguranca
	 */
	public Integer getSeguranca() {
		return seguranca;
	}

	/**
	 * @param seguranca the seguranca to set
	 */
	public void setSeguranca(Integer seguranca) {
		this.seguranca = seguranca;
	}

	/**
	 * @return the vencimento
	 */
	public String getVencimento() {
		return vencimento;
	}

	/**
	 * @param vencimento the vencimento to set
	 */
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}

	/**
	 * @return the pessoafisica
	 */
	public PessoaFisica getPessoafisica() {
		return pessoafisica;
	}

	/**
	 * @param pessoafisica the pessoafisica to set
	 */
	public void setPessoafisica(PessoaFisica pessoafisica) {
		this.pessoafisica = pessoafisica;
	}

}
