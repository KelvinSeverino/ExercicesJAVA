package RevisaoIfElse;

public class IfElse {

	public static void main(String args[]){
		
		java.util.Scanner leitor = new java.util.Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		System.out.println("Insira uma valor para N1:");
		n1 = leitor.nextInt();
		System.out.println("Insira uma valor para N2:");
		n2 = leitor.nextInt();
		
		if (n1 > n2)
		{
			System.out.println("N1 maior que N2");
		}
		else if (n1 < n2)
		{
			System.out.println("N2 maior que N1");
		}
		if (n1 == n2)
		{
			System.out.println("N1 igual a N2");
		}
		else if (n1 != n2)
		{
			System.out.println("N1 é diferente de N2");
		}
	}
}

