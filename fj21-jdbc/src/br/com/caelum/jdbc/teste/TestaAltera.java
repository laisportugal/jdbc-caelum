package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.dao.ContatoDAO;
import br.com.caelum.modelo.Contato;

public class TestaAltera {
	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato(1L, "lais", "lais@aaa.com",Calendar.getInstance(), "rua xts");
		dao.altera(contato);
	}
}
