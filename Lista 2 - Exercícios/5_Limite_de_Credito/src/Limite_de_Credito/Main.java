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
			JOptionPane.showMessageDialog(null,"Cliente: "+c.getNome()+" EXCEDEU o limite de crédito");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Cliente "+c.getNome()+" NÃO excedeu o limite de crédito");
		}
		
	}

}
