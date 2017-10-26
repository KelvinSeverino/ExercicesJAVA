package CalculadoraFor;

import java.util.Scanner;

public class cfor {
	public static void main(String args[]){
		Scanner leitor = new java.util.Scanner(System.in);
		boolean executar = true;
		while(executar)
		{
			System.out.println("Calculadora Básica");
			System.out.println("Digite a opção que você deseja");
			System.out.println("1-SOMA\n2-SUBTRAÇÃO\n3-MULTIPLICAÇÃO\n4-DIVISÃO\n5-SAIR");
			int opcao = leitor.nextInt();
			if(opcao == 1)
			{
				System.out.println("Digite o primeiro número:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo número:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 + n2);
			}
			if(opcao == 2)
			{
				System.out.println("Digite o primeiro número:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo número:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 - n2);
			}
			if(opcao == 3)
			{
				System.out.println("Digite o primeiro número:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo número:");
				int n2 = leitor.nextInt();
				System.out.printf("Resultado: %d\n\n", n1 * n2);
			}
			if(opcao == 4)
			{
				System.out.println("Digite o primeiro número:");
				int n1 = leitor.nextInt();
				System.out.println("Digite o segundo número:");
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
