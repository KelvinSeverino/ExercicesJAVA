package Limite_de_Credito;

public class Cliente extends Pessoa{
	public String nome;
	public int n_conta;
	public double saldo_inicio_mes;
	public double total_mes;
	public double total_credito;
	public double limite_credito;
	public Cliente(String nome, int n_conta, double saldo_inicio_mes, double total_mes, double total_credito, double limite_credito)
	{
		super(nome, n_conta, saldo_inicio_mes, total_mes, total_credito, limite_credito);
		
	}
	

}
