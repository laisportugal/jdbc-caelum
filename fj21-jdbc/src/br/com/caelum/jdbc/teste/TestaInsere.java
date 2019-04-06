package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {

		Contato contato = new Contato();
		contato.setNome("Lais sem email");
		contato.setEmail("");
		contato.setEndereco("endereco x");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		
		System.out.println("Gravado");
	}

}