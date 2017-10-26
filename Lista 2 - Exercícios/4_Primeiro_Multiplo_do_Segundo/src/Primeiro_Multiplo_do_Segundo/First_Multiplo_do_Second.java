package Primeiro_Multiplo_do_Segundo;

import javax.swing.*;
public class First_Multiplo_do_Second {
	public static void main(String args[]){
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o N1: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o N2: "));
		
		if( n1 / n2 == 0)
		{
			JOptionPane.showMessageDialog(null, +n1+" É multiplo de "+n2);
		}
		else
		{
			JOptionPane.showMessageDialog(null, +n1+" NÃO É multiplo de " +n2);
		}
		
	}

}
