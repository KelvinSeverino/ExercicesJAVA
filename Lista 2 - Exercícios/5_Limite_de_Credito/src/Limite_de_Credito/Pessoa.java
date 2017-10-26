package Limite_de_Credito;

public abstract class Pessoa {
	private String nome;
	private int n_conta;
	private double saldo_inicio_mes;
	private double total_mes;
	private double total_credito;
	private double limite_credito;
	
	public Pessoa(String nome, int n_conta, double saldo_inicio_mes, double total_mes, double total_credito, double limite_credito) {
		this.nome = nome;
		this.n_conta = n_conta;
		this.saldo_inicio_mes = saldo_inicio_mes;
		this.total_mes = total_mes;
		this.total_credito = total_credito;
		this.limite_credito = limite_credito;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getN_conta() {
		return n_conta;
	}
	public void setN_conta(int n_conta) {
		this.n_conta = n_conta;
	}
	
	
	public double getSaldo_inicio_mes() {
		return saldo_inicio_mes;
	}
	public void setSaldo_inicio_mes(double saldo_inicio_mes) {
		this.saldo_inicio_mes = saldo_inicio_mes;
	}
	
	
	public double getTotal_mes() {
		return total_mes;
	}
	public void setTotal_mes(double total_mes) {
		this.total_mes = total_mes;
	}
	
	
	public double getTotal_credito() {
		return total_credito;
	}
	public void setTotal_credito(double total_credito) {
		this.total_credito = total_credito;
	}
	
	
	public double getLimite_credito() {
		return limite_credito;
	}
	public void setLimite_credito(double limite_credito) {
		this.limite_credito = limite_credito;
	}
	
}
