import javax.swing.*;
public class Calculo {
	public static void main(String args[])
	{
		double soma, subtracao, divisao, produto;
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o N1:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o N2:"));
		
		soma = n1 + n2;
		subtracao = n1 - n2;
		divisao = n1 / n2;
		produto = n1 * n2;
		
		JOptionPane.showMessageDialog(null,"Soma: " + soma +"\nSubtração: " + subtracao + "\nDivisão: " + divisao + "\nProduto: " + produto);		
	}

}