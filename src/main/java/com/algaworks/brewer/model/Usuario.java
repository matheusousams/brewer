package com.algaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	@NotBlank(message = "E-mail é obrigatório")
	private String email;
	@NotBlank(message = "Data de Nascimento é obrigatória")
	private String dataNascimento;
	@NotBlank(message = "Senha é obrigatória")
	private String senha;
	
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
