package br.com.caelum.modelo;

import java.util.Calendar;

public class Contato {
	private Long id;
	private String nome;
	private String email;
	private Calendar dataNascimento;
	private String endereco;

	public Contato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contato(Long id, String nome, String email, Calendar dataNascimento, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
