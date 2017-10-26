package br.fatec.modelo;

import java.util.ArrayList;

public class Professor extends Pessoa{
	
	private String nome;
	private String email;
	private String telefone;
	public ArrayList<Professor> professores;
	private String numeroRegistro;
	private String qtdeHoraAula;
	
	public Professor(String nome, String email, String telefone, String numeroRegistro, String qtdeHoraAula)
	{
		super(nome, email, telefone);
	}
	
	public String dadosFormatados()
	{
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nRegistro: " +this.getNumeroRegistro();
		dadosFormatados = dadosFormatados + "\nHora/Aula: "+this.getQtdeHoraAula();
		return dadosFormatados();
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

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getQtdeHoraAula() {
		return qtdeHoraAula;
	}
	public void setQtdeHoraAula(String qtdeHoraAula) {
		this.qtdeHoraAula = qtdeHoraAula;
	}
}
