package Soma_Media_NCrescente;

import javax.swing.*;
public class Soma_Media_NCrescente {
	public static void main(String args[]) {
		double soma, media;
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o N1:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o N2: "));
		
		soma = n1 + n2;
		media = (n1 + n2) / 2;
		
		if (n1 > n2)
		{
			JOptionPane.showMessageDialog(null,"Soma: " +soma+ "\nMédia: " +media+ "\n" +n1+  " é maior que " +n2);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Soma: " +soma+ "\nMédia: " +media+ "\n" +n2+  " é maior que " +n1);
		}
	}

}
