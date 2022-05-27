package br.com.dienepher.domain.perfil;

import java.io.Serializable;

/**
 * classe que recebeos dados de Motorista
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Motorista extends Funcionario implements Serializable {
	
	Integer CNH;
	String Categoria;
	Boolean EAR;
	
private Funcionario funcionario;
	
	public Motorista() {
		super();
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CNH == null) ? 0 : CNH.hashCode());
		result = prime * result + ((Categoria == null) ? 0 : Categoria.hashCode());
		result = prime * result + ((EAR == null) ? 0 : EAR.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
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
		Motorista other = (Motorista) obj;
		if (CNH == null) {
			if (other.CNH != null)
				return false;
		} else if (!CNH.equals(other.CNH))
			return false;
		if (Categoria == null) {
			if (other.Categoria != null)
				return false;
		} else if (!Categoria.equals(other.Categoria))
			return false;
		if (EAR == null) {
			if (other.EAR != null)
				return false;
		} else if (!EAR.equals(other.EAR))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
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
	public Integer getNumeroDeRegistro() {
		// TODO Auto-generated method stub
		return super.getNumeroDeRegistro();
	}



	@Override
	public void setNumeroDeRegistro(Integer numeroDeRegistro) {
		// TODO Auto-generated method stub
		super.setNumeroDeRegistro(numeroDeRegistro);
	}



	@Override
	public Boolean getEstaAtivo() {
		// TODO Auto-generated method stub
		return super.getEstaAtivo();
	}



	@Override
	public void setEstaAtivo(Boolean estaAtivo) {
		// TODO Auto-generated method stub
		super.setEstaAtivo(estaAtivo);
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
	 * @return the cNH
	 */
	public Integer getCNH() {
		return CNH;
	}

	/**
	 * @param cNH the cNH to set
	 */
	public void setCNH(Integer cNH) {
		CNH = cNH;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return Categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	/**
	 * @return the eAR
	 */
	public Boolean getEAR() {
		return EAR;
	}

	/**
	 * @param eAR the eAR to set
	 */
	public void setEAR(Boolean eAR) {
		EAR = eAR;
	}

	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	
}
