package Salario_Por_Hora;

import javax.swing.*;
public class Salario {
	public static void main(String args[]) {
		double hora_normal = 3.90;
		double qtde_hora_extra;
		double hora_extra;
		double total_hr_extra;
		double acrescimo;
		double sal_bruto;
		
		int horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de horas trabalhadas: "));
		
		if (horas_trabalhadas > 40)
		{
			qtde_hora_extra = horas_trabalhadas - 40;
			
			hora_extra = hora_normal * 0.50;
			total_hr_extra = hora_extra + hora_normal;
			
			acrescimo = qtde_hora_extra * total_hr_extra;
			sal_bruto  = (horas_trabalhadas * hora_normal) + acrescimo;			
			JOptionPane.showMessageDialog(null, "Horas Trabalhadas: "+horas_trabalhadas+"\nSalario Bruto: " +sal_bruto);
			
		}
		else
		{
			sal_bruto = horas_trabalhadas * hora_normal;
			JOptionPane.showMessageDialog(null, "Horas Trabalhadas: "+horas_trabalhadas+"\nSalario Bruto: " +sal_bruto);
		}
	}
}
