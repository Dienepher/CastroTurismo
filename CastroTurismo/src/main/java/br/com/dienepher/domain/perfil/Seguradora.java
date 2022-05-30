package br.com.dienepher.domain.perfil;

import java.io.Serializable;

/**
 * classe que recebeos dados de seguradora
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Seguradora  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String corretor;
	private String telefone;
	

	public Seguradora() {
		super();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corretor == null) ? 0 : corretor.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seguradora other = (Seguradora) obj;
		if (corretor == null) {
			if (other.corretor != null)
				return false;
		} else if (!corretor.equals(other.corretor))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
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


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * @return the corretor
	 */
	public String getCorretor() {
		return corretor;
	}


	/**
	 * @param corretor the corretor to set
	 */
	public void setCorretor(String corretor) {
		this.corretor = corretor;
	}


	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}


	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}