package br.com.dienepher.aplication.pessoa;

import br.com.dienepher.domain.local.Cidade;
import br.com.dienepher.domain.local.Estado;
import br.com.dienepher.domain.local.Pais;
import br.com.dienepher.domain.perfil.Motorista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PAIS
		Pais pais = new Pais();
		pais.setId(1);
		pais.setNome("Brasil");
		System.out.println(pais);

		// Estado
		Estado estado = new Estado();
		estado.setId(1);
		estado.setNome("Parana");
		estado.setPais(pais);
		System.out.println(estado);

		Estado sp = new Estado();
		sp.setId(2);
		sp.setNome("São Paulo");
		sp.setPais(pais);
		System.out.println(sp);

//Cidade
		Cidade castro = new Cidade();
		castro.setId(1);
		castro.setNome("Castro");
		castro.setEstado(estado);

		Cidade itp = new Cidade();
		itp.setId(2);
		itp.setNome("Itapetininga");
		itp.setEstado(sp);

//pessoa
		Motorista motorista = new Motorista();
		motorista.setNome("Tubarao da 151");
		motorista.setTelefoneCelular("42 9999-3267");
		motorista.setLogradouro("Rua tal");
		motorista.setComplemento("Apt 01");
		motorista.setEmail("tubarao151@caastroturismo.com.br");
		motorista.setCidade(castro);
		motorista.setCPF(23456783);
		motorista.setRG(1234567);
		motorista.setOrgaoEmissor("SSPR");

		Date dataNascimento = new Date();
		motorista.setDataDeNascimento(dataNascimento);
		motorista.setNumeroDeRegistro(1233);
		motorista.setEstaAtivo(true);
		motorista.setCNH(123456789);
		motorista.setCategoria("AE");
		motorista.setEAR(true);

	}

}
