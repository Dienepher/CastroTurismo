package br.com.dienepher.domain.perfil;

import java.io.Serializable;

import br.com.dienepher.domain.seguranca.Funcionario;

/**
 * classe que recebeos dados de menores
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Menores extends Passageiro implements Serializable  {
	
	private Boolean autorizacaoDeEmbarque;
	private Passageiro responsavel;
	
private Passagerio passagerio;
	
	public Menores() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autorizacaoDeEmbarque == null) ? 0 : autorizacaoDeEmbarque.hashCode());
		result = prime * result + ((responsavel == null) ? 0 : responsavel.hashCode());
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
		Menores other = (Menores) obj;
		if (autorizacaoDeEmbarque == null) {
			if (other.autorizacaoDeEmbarque != null)
				return false;
		} else if (!autorizacaoDeEmbarque.equals(other.autorizacaoDeEmbarque))
			return false;
		if (responsavel == null) {
			if (other.responsavel != null)
				return false;
		} else if (!responsavel.equals(other.responsavel))
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

	@Override
	public Integer getNumerocartao() {
		// TODO Auto-generated method stub
		return super.getNumerocartao();
	}

	@Override
	public void setNumerocartao(Integer numerocartao) {
		// TODO Auto-generated method stub
		super.setNumerocartao(numerocartao);
	}

	@Override
	public Integer getSeguranca() {
		// TODO Auto-generated method stub
		return super.getSeguranca();
	}

	@Override
	public void setSeguranca(Integer seguranca) {
		// TODO Auto-generated method stub
		super.setSeguranca(seguranca);
	}

	@Override
	public String getVencimento() {
		// TODO Auto-generated method stub
		return super.getVencimento();
	}

	@Override
	public void setVencimento(String vencimento) {
		// TODO Auto-generated method stub
		super.setVencimento(vencimento);
	}

	@Override
	public PessoaFisica getPessoafisica() {
		// TODO Auto-generated method stub
		return super.getPessoafisica();
	}

	@Override
	public void setPessoafisica(PessoaFisica pessoafisica) {
		// TODO Auto-generated method stub
		super.setPessoafisica(pessoafisica);
	}

	/**
	 * @return the autorizacaoDeEmbarque
	 */
	public Boolean getAutorizacaoDeEmbarque() {
		return autorizacaoDeEmbarque;
	}

	/**
	 * @param autorizacaoDeEmbarque the autorizacaoDeEmbarque to set
	 */
	public void setAutorizacaoDeEmbarque(Boolean autorizacaoDeEmbarque) {
		this.autorizacaoDeEmbarque = autorizacaoDeEmbarque;
	}

	/**
	 * @return the responsavel
	 */
	public Passageiro getResponsavel() {
		return responsavel;
	}

	/**
	 * @param responsavel the responsavel to set
	 */
	public void setResponsavel(Passageiro responsavel) {
		this.responsavel = responsavel;
	}

	/**
	 * @return the passagerio
	 */
	public Passagerio getPassagerio() {
		return passagerio;
	}

	/**
	 * @param passagerio the passagerio to set
	 */
	public void setPassagerio(Passagerio passagerio) {
		this.passagerio = passagerio;
	}

}
