package Estacionamento_Por_Hora;

import javax.swing.*;
public class Estacionamento_Por_Hora {
	public static void main(String args[]) {
		double taxa = 2.00, adicional = 0.50, total;
		int tempo_extra;
		int tempo = Integer.parseInt(JOptionPane.showInputDialog("Até 3 horas o Estacionamento é R$2,00\nApós 3 horas é cobrado R$0,50 por hora\n\n"
				+ "Insira o tempo que o carro ficou no estacionamento: "));
		
		if(tempo > 3)
		{
			tempo_extra = tempo - 3;
			total = (tempo_extra * adicional) + taxa;
			JOptionPane.showMessageDialog(null, "O Seu veículo permaneceu no estacionamento por " +tempo+ " horas\nTotal a pagar: R$"+total);
		}
		else
		{
			total = taxa;
			JOptionPane.showMessageDialog(null, "O Seu veículo permaneceu no estacionamento por " +tempo+ " horas\nTotal a pagar: R$"+total);
		}
	}

}
