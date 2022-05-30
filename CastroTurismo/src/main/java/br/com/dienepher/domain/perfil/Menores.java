package br.com.dienepher.domain.perfil;

import java.io.Serializable;
import java.util.Date;

import br.com.dienepher.domain.local.Cidade;


/**
 * classe que recebeos dados de menores
 * 
 * @author dienepher.8978 @version1.0.0 @since1.0.0
 */

public class Menores extends Passageiro implements Serializable {

	private static final long serialVersionUID = 1L;

	private Boolean autorizacaoDeEmbarque;
	private Passageiro responsavel;

	
	public Menores() {
		super();
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


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
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


	@Override
	public Date getDataDeNascimento() {
		// TODO Auto-generated method stub
		return super.getDataDeNascimento();
	}


	@Override
	public void setDataDeNascimento(Date dataDeNascimento) {
		// TODO Auto-generated method stub
		super.setDataDeNascimento(dataDeNascimento);
	}


	@Override
	public String getTelefoneCelular() {
		// TODO Auto-generated method stub
		return super.getTelefoneCelular();
	}


	@Override
	public void setTelefoneCelular(String telefoneCelular) {
		// TODO Auto-generated method stub
		super.setTelefoneCelular(telefoneCelular);
	}


	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}


	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}


	@Override
	public String getLogradouro() {
		// TODO Auto-generated method stub
		return super.getLogradouro();
	}


	@Override
	public void setLogradouro(String logradouro) {
		// TODO Auto-generated method stub
		super.setLogradouro(logradouro);
	}


	@Override
	public String getComplemento() {
		// TODO Auto-generated method stub
		return super.getComplemento();
	}


	@Override
	public void setComplemento(String complemento) {
		// TODO Auto-generated method stub
		super.setComplemento(complemento);
	}


	@Override
	public Cidade getCidade() {
		// TODO Auto-generated method stub
		return super.getCidade();
	}


	@Override
	public void setCidade(Cidade cidade) {
		// TODO Auto-generated method stub
		super.setCidade(cidade);
	}
	
	
}
