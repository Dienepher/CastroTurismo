package br.com.dienepher.domain.perfil;

import br.com.dienepher.domain.local.Cidade;

/**
 * classe que recebeos dados de pessoa
 * 
 * @author dienepher.8978 @version1.0.0 @since1.0.0
 */
public abstract class Pessoa {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String telefoneCelular;
	private String email;
	private String logradouro;
	private String Complemento;
	private Integer numero;
	private Cidade cidade;
	
	

	public Pessoa() {
		super();
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
	 * @return the telefoneCelular
	 */
	public String getTelefoneCelular() {
		return telefoneCelular;
	}



	/**
	 * @param telefoneCelular the telefoneCelular to set
	 */
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}



	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return Complemento;
	}



	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}



	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}



	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	/**
	 * @return the cidade
	 */
	public Cidade getCidade() {
		return cidade;
	}



	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Complemento == null) ? 0 : Complemento.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((telefoneCelular == null) ? 0 : telefoneCelular.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (Complemento == null) {
			if (other.Complemento != null)
				return false;
		} else if (!Complemento.equals(other.Complemento))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (telefoneCelular == null) {
			if (other.telefoneCelular != null)
				return false;
		} else if (!telefoneCelular.equals(other.telefoneCelular))
			return false;
		return true;
	}


}
