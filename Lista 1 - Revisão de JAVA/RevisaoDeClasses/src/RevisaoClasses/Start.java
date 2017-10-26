package RevisaoClasses;

import javax.swing.JOptionPane;

public class Start {
	public static void main(String args[]) {
		Professor p = new Professor("Kakashi", 020202);
		p.turmas[0] = "ADS-B";
		Aluno aluno = new Aluno("Kakaroto", 35363, "ADS-A");
		
		JOptionPane.showMessageDialog(null,"Professor: "+p.getNome()+"\nTurma: "+p.turmas[0]);
		JOptionPane.showMessageDialog(null,"Aluno: "+aluno.getNome()+"\nNº Matricula: "+aluno.numeroMatricula);
	}

}
