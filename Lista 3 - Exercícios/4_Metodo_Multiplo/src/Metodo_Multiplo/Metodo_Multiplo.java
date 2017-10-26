package Metodo_Multiplo;

import javax.swing.*;

public class Metodo_Multiplo {
	public static void metodo() {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Entra com o N1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Entra com o N2: "));
		
		if(n2 % n1 == 0)
		{
			JOptionPane.showMessageDialog(null, true);			
		}
		else
		{
			JOptionPane.showMessageDialog(null, false);		
		}
	}
	public static void main(String args[]) {
		metodo();		
	}
}
