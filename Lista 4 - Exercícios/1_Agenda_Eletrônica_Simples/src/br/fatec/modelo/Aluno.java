package br.fatec.modelo;

import java.util.ArrayList;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	private String numeroMatricula;
	private String nome;
	private String email;
	private String telefone;
	public ArrayList<Aluno> alunos;
	
	public Aluno(String nome, String email, String telefone, String numeroMatricula)
	{
		super(nome, email, telefone);
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String dadosFormatados()
	{
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados +"\nMatricula: "+this.getNumeroMatricula();
		return dadosFormatados;
	}
	
	public String getNumeroMatricula()
	{
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(String numeroMatricula)
	{
		this.numeroMatricula = numeroMatricula;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

