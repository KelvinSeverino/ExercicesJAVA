package Pgto_de_comissoes;

import javax.swing.*;
public class Comissoes {
	public static void main(String args[])
	{
		double sal_p_semana = 200.00;
		double porcentagem = 0.09;
		double comissao;
		double total_receber;
		
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor TOTAL de vendas: "));
		
		comissao = vendas * porcentagem;
		
		total_receber = comissao + sal_p_semana;
		
		JOptionPane.showMessageDialog(null, "Valor das Vendas: " +vendas+"\nValor da Comissão: "+comissao+"\nTotal a Receber: "+total_receber);
	}

}
