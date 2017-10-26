package Criptografar_Dados;

import javax.swing.*;
public class Criptografar {
	public static void main(String args[])
	{
		int code = Integer.parseInt(JOptionPane.showInputDialog("Insira o Código: "));
		
		String s = String.valueOf(code);
		
		String[] veta = s.split("");
	
		int veta0 = Integer.parseInt(veta[0]);
		int veta1 = Integer.parseInt(veta[1]);
		int veta2 = Integer.parseInt(veta[2]);
		int veta3 = Integer.parseInt(veta[3]);
		
		int n0,n1,n2,n3;
		n0 = (veta0 + 7) % 10;
		n1 = (veta1 + 7) % 10;
		n2 = (veta2 + 7) % 10;
		n3 = (veta3 + 7) % 10;
		
		String dig0, dig1, dig2, dig3;		
		dig0 = String.valueOf(n0);
		dig1 = String.valueOf(n1);
		dig2 = String.valueOf(n2);
		dig3 = String.valueOf(n3);
		
		String r = dig2+dig3+dig0+dig1;
		String a = dig0+dig1+dig2+dig3;
		
		int novo_code = Integer.parseInt(r);		
		
		JOptionPane.showMessageDialog(null, ""+novo_code+"\n"+a);
		
		
	}
}