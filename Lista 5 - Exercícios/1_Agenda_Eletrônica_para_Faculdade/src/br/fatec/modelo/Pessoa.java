package br.fatec.modelo;

public abstract class Pessoa implements Contato{
	private String nome;
	private String telefone;
	private String email;
	
	public Pessoa(String nome, String telefone, String email)
	{
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String dadosFormatados()
	{
		String dadosFormatados;
		dadosFormatados = "\nNome: " +this.getNome();
		dadosFormatados = dadosFormatados +"\nTelefone: "+this.getTelefone();
		dadosFormatados = dadosFormatados +"\nEmail: "+this.getEmail();
		
		return dadosFormatados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
