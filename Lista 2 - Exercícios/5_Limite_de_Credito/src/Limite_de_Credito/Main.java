package Limite_de_Credito;

import javax.swing.*;

public class Main {
	public static void main(String args[])
	{
		double novo_saldo;
		Cliente c = new Cliente("Kelvin",001,150.00,1500.00,450.00,500.00);
		
		novo_saldo = (c.getSaldo_inicio_mes() + c.getTotal_mes()) - c.getTotal_credito();
		
		if (novo_saldo > 550)
		{
			JOptionPane.showMessageDialog(null,"Cliente: "+c.getNome()+" EXCEDEU o limite de cr�dito");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Cliente "+c.getNome()+" N�O excedeu o limite de cr�dito");
		}
		
	}

}
