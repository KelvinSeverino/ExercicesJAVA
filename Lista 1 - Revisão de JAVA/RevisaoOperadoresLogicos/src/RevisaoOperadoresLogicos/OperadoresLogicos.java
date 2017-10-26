package RevisaoOperadoresLogicos;

public class OperadoresLogicos {
	public void and(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int n = 0; n<4; n++)
		{
			resultado[n] = coluna1[n] && coluna2[n];
			System.out.printf("%s and %s = %s \n", coluna1[n], coluna2[n], resultado[n]);
		}
	}
	public static void main(String args[]) {
		boolean[] coluna1 = {true, true, false, false};
		boolean[] coluna2 = {true, false, true, false};
		boolean[] resultado = new boolean[4];
		
		OperadoresLogicos operadores = new OperadoresLogicos();
		
		operadores.and(coluna1, coluna2, resultado);
		System.out.printf("\n");
		operadores.or(coluna1, coluna2, resultado);
		System.out.printf("\n");
		operadores.not(coluna1, coluna2, resultado);
		
	}
	
	public void or(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int n=0; n<4; n++){
			resultado[n] = coluna1[n] || coluna2[n];
			System.out.printf("%s or %s = %s \n", coluna1[n], coluna2[n], resultado[n]);
			
		}
	}
	public void not(boolean[] coluna1, boolean[] coluna2, boolean[] resultado) {
		for (int n=0; n<4; n++){
			resultado[n] = !coluna1[n] == !coluna2[n];
			System.out.printf("%s not %s = %s \n", coluna1[n], coluna2[n], resultado[n]);
			
		}
	}
}
