package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.ConnectionFactory;
import br.com.caelum.modelo.Funcionario;

public class FuncionarioDAO {
	private Connection connection;

	public FuncionarioDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Funcionario funcionario) {
		String sql = "insert into funcionarios(nome, usuario, senha)" + " values(?,?,?);";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getUsuario());
			stmt.setString(3, funcionario.getSenha());

			stmt.execute();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Funcionario> getLista() {
		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from funcionarios;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				funcionario.setSenha(rs.getString("senha"));
				funcionarios.add(funcionario);

			}
			rs.close();
			stmt.close();
			return funcionarios;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public void remove(Funcionario funcionario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete * from funcionarios where id=?");
			stmt.setLong(1, funcionario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
