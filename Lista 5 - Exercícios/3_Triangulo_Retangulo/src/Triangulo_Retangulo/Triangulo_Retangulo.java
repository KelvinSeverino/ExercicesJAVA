package Triangulo_Retangulo;

import javax.swing.*;

public class Triangulo_Retangulo {

	public static void main(String[] args) {
		
		int hipotenusaA = Integer.parseInt(JOptionPane.showInputDialog("(A) - Hipotenusa: "));
		int catetoB = Integer.parseInt(JOptionPane.showInputDialog("(B) - Cateto: "));
		int catetoC = Integer.parseInt(JOptionPane.showInputDialog("(C) - Cateto: "));
		
		int hipotenusaQuadrado, somaCatetoQuadrado;
		
		if(hipotenusaA != 0 && catetoB != 0 && catetoC != 0)
		{
			hipotenusaQuadrado = hipotenusaA * hipotenusaA;	
			somaCatetoQuadrado = (catetoB * catetoB) + (catetoC * catetoC); //math.pow(catetoB, 2) e math.pow(catetoC, 2)
			
			if(hipotenusaQuadrado == somaCatetoQuadrado)
			{
				JOptionPane.showMessageDialog(null, "Os valores inseridos FORMAM um Tri�ngulo Retangulo!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Os valores inseridos N�O FORMAM um Tri�ngulo Retangulo!");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "ERROR! Insira um valor Diferente de ZERO!");
		}
	}
}