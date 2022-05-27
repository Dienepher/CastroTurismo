package br.com.dienepher.domain.perfil;

import java.io.Serializable;

/**
 * classe que recebeos dados de Funcionario
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */
public class Funcionario  extends PessoaFisica implements Serializable  {
	
	private Integer numeroDeRegistro;
	private 	Boolean estaAtivo;
	
private PessoaFisica pessoafisica;
	
	public Funcionario() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((estaAtivo == null) ? 0 : estaAtivo.hashCode());
		result = prime * result + ((numeroDeRegistro == null) ? 0 : numeroDeRegistro.hashCode());
		result = prime * result + ((pessoafisica == null) ? 0 : pessoafisica.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (estaAtivo == null) {
			if (other.estaAtivo != null)
				return false;
		} else if (!estaAtivo.equals(other.estaAtivo))
			return false;
		if (numeroDeRegistro == null) {
			if (other.numeroDeRegistro != null)
				return false;
		} else if (!numeroDeRegistro.equals(other.numeroDeRegistro))
			return false;
		if (pessoafisica == null) {
			if (other.pessoafisica != null)
				return false;
		} else if (!pessoafisica.equals(other.pessoafisica))
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
	 * @return the numeroDeRegistro
	 */
	public Integer getNumeroDeRegistro() {
		return numeroDeRegistro;
	}

	/**
	 * @param numeroDeRegistro the numeroDeRegistro to set
	 */
	public void setNumeroDeRegistro(Integer numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}

	/**
	 * @return the estaAtivo
	 */
	public Boolean getEstaAtivo() {
		return estaAtivo;
	}

	/**
	 * @param estaAtivo the estaAtivo to set
	 */
	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
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
