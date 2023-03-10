package com.registro.usuarios.dto;

public class UsuarioRegistroDTO {

	private Long id;
	private String nome;
	private String apelido;
	private String email;
	private String senha;

	public UsuarioRegistroDTO() {
	}

	public UsuarioRegistroDTO(Long id, String nome, String apelido, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.email = email;
		this.senha = senha;
	}

	public UsuarioRegistroDTO(String nome, String apelido, String email, String senha) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.email = email;
		this.senha = senha;
	}
	
	public UsuarioRegistroDTO(String email) {
		super();
		this.email = email;
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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
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

}
