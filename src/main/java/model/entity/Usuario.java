package model.entity;

import java.time.LocalDate;

public class Usuario {
	
	private int id;
	private String nome;
	private String email;
	private String senha;
	private String login;
	private LocalDate dataCadastro;
	private LocalDate dataExpiracao;
	
	public Usuario(int id, String nome, String email, String senha, String login, LocalDate dataCadastro,
			LocalDate dataExpiracao) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.login = login;
		this.dataCadastro = dataCadastro;
		this.dataExpiracao = dataExpiracao;
	}
	
	public Usuario() {
		super();
	
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDate getDataExpiracao() {
		return dataExpiracao;
	}
	public void setDataExpiracao(LocalDate dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
	
	
	
}
