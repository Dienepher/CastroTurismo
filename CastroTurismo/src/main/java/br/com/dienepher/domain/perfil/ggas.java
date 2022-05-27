package br.com.dienepher.domain.perfil;


public class ggas {
	
	Integer id;
	String nome;
	string telefoneCelular;
	string email;
	string logradouro;
	string Complemento;
	Integer numero;
	private Cidade cidade;
	
	public ggas() {
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
	public string getTelefoneCelular() {
		return telefoneCelular;
	}

	/**
	 * @param telefoneCelular the telefoneCelular to set
	 */
	public void setTelefoneCelular(string telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	/**
	 * @return the email
	 */
	public string getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(string email) {
		this.email = email;
	}

	/**
	 * @return the logradouro
	 */
	public string getLogradouro() {
		return logradouro;
	}

	/**
	 * @param logradouro the logradouro to set
	 */
	public void setLogradouro(string logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @return the complemento
	 */
	public string getComplemento() {
		return Complemento;
	}

	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(string complemento) {
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
