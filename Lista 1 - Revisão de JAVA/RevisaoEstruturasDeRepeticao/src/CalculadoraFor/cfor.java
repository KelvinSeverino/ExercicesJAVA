package CalculadoraFor;

import java.util.Scanner;

public class cfor {
	public static void main(String args[]){
		Scanner leitor = new java.util.Scanner(System.in);
		boolean executar = true;
		while(executar)
		{
			System.out.println("Calculadora B�sica");
			System.out.println("Digite a op��o que voc� deseja");
			System.out.println("1-SOMA\n2-SUBTRA��O\n3-MULTIPLICA��O\n4-DIVIS�O\n5-SAIR");
			int opcao = leitor.nextInt();
			if(opcao == 1)
			{
				System.out.println("Digite o primeiro n�mero:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 + n2);
			}
			if(opcao == 2)
			{
				System.out.println("Digite o primeiro n�mero:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 - n2);
			}
			if(opcao == 3)
			{
				System.out.println("Digite o primeiro n�mero:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 * n2);
			}
			if(opcao == 4)
			{
				System.out.println("Digite o primeiro n�mero:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo n�mero:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 / n2);
			}
			if(opcao == 5)
			{
				executar = false;
			}
		}		
	}	
}
