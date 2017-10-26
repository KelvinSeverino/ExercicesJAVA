package MaiorMenorNumero;

import javax.swing.*;
public class MaiorMenorNum {
	public static void main(String args[]) {
		int c;
		int maior = 0, menor = 0;
		int vetor[] = new int[5];
		
		for (c = 0; c < 5; c++)
		{
			vetor[c] = Integer.parseInt(JOptionPane.showInputDialog("Insira um Número["+c+"]: "));	
			if(vetor[c] > maior)
			{
				maior = vetor[c];
			}
		}
		for (c = 0; c < 5; c++) 
		{
			if(vetor[c] < menor)
			{
				menor = vetor[c];
			}
		}
		
		JOptionPane.showMessageDialog(null,"Maior:" +maior+ "\nMenor:" +menor);
	}
}
