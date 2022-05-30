package br.com.dienepher.domain.seguranca;

import java.io.Serializable;

/**
 * classe que recebeos dados de login
 * @author dienepher.8978
 *@version1.0.0
 *@since1.0.0
 */

public class Login extends Funcionario implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String login;
	private String senha ;
	
private Funcionario funcionario;
	
	public Login() {
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
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
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
