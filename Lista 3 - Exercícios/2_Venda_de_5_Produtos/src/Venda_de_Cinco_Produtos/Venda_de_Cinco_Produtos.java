package Venda_de_Cinco_Produtos;

import javax.swing.*;
public class Venda_de_Cinco_Produtos {
	public static void main(String args[])
	{
		float p1 = 1.00f, p2 = 2.98f, p3 = 9.98f, p4 = 4.49f, p5 = 6.87f;
		float r1 = 0f, r2 = 0f, r3 = 0f, r4 = 0f, r5 = 0f, rf = 0f;
		int qtde = 0;
		int sair = 0;
		int opcao = 0;
		
		while(sair == 0)
		{
			switch(opcao){
				
				case 1:{
					qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a qtde Vendida do p1: "));
					r1 = r1 + qtde * p1;
					opcao = 0;
					break;
				}
				case 2:{
					qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a qtde Vendida do p2: "));
					r2 = r2 + qtde * p2;
					opcao = 0;
					break;
				}
				case 3:{
					qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a qtde Vendida do p3: "));
					r3 = r3 + qtde * p3;
					opcao = 0;
					break;
				}
				case 4:{
					qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a qtde Vendida do p4: "));
					r4 = r4 + qtde * p4;
					opcao = 0;
					break;
				}
				case 5:{
					qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a qtde Vendida do p5: "));
					r5 = r5 + qtde * p5;
					opcao = 0;					
					break;
				}
				case 6:{
					sair = 1;
					JOptionPane.showMessageDialog(null, "\nAté Logo!\n");
					break;
				}
				default:{
					opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha um dos Produtos para Compra: "
							+ "\n1 - R$1,00\n2 - R$2,98\n3 - R$9,98\n4 - R$4,49\n5 - R$6.87\nDigite 6 para SAIR!"));
					break;
				}
			}
		}
		rf = r1 + r2 + r3 + r4 + r5;
		System.out.printf("Total do valor de vendas: R$ %.2f\n",rf);
		
		r1 = (r1/rf)*100;
		r2 = (r2/rf)*100;
		r3 = (r3/rf)*100;
		r4 = (r4/rf)*100;
		r5 = (r5/rf)*100;
		//JOptionPane.showMessageDialog(null, "Valor da venda total: R$"+rf+"\nO P1 tem "+r1+"% de participação nas vendas!\nO P2 tem "
		//+r2+"% de participação nas vendas!\nO P3 tem "+r3+"% de participação nas vendas!\nO P4 tem "+r4+"% de participação nas vendas!\nO P5 tem "+r5+"% de participação nas vendas!\n");
		System.out.printf("O P1 teve uma participação de %.2f por cento\n",r1);
		System.out.printf("O P2 teve uma participação de %.2f por cento\n",r2);
		System.out.printf("O P3 teve uma participação de %.2f por cento\n",r3);
		System.out.printf("O P4 teve uma participação de %.2f por cento\n",r4);
		System.out.printf("O P5 teve uma participação de %.2f por cento\n",r5);
	}
}
