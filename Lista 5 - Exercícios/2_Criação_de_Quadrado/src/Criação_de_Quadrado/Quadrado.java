package Criação_de_Quadrado;

import javax.swing.*;

public class Quadrado {

	public static void main(String[] args) {	

		int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira o Tamanho dos Lados do Quadrado: "));
		if (tam >= 1 && tam <= 20)
		{
			int c = 0;
			
			for(int i = 0; i < tam; i++)
			{
				System.out.printf("*");
			}
			System.out.println("");
			
			String x = "*";
			String z = "*";
			while(c < tam-2)
			{
				x = x + " ";
				c++;
			}
			x = x + z;
			
			for(int i = 0; i < tam-2; i++)
			{
				System.out.println(x);
			}
			
			for(int i = 0; i < tam; i++)
			{
				System.out.printf("*");
			}
		}
		else
		{
			System.out.printf("Insira uma valor entre 1 e 20");
		}		
	}
}
