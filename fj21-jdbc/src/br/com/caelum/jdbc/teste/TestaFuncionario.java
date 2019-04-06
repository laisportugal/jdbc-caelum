package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.dao.FuncionarioDAO;
import br.com.caelum.modelo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lais");
		funcionario.setUsuario("lais.portugal");
		funcionario.setSenha("1234");
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Renan");
		funcionario2.setUsuario("renan.portugal");
		funcionario2.setSenha("1234");

		FuncionarioDAO dao = new FuncionarioDAO();
		dao.adiciona(funcionario);

		System.out.println("Gravado");

		List<Funcionario> funcionariosList = dao.getLista();
	
		for (Funcionario f : funcionariosList) {
			System.out.println("Nome: " + funcionario.getNome());
			System.out.println("Email: " +funcionario.getUsuario());
			System.out.println("Endereco: "+ funcionario.getSenha());
			
		}
		
					
		
	}
}
