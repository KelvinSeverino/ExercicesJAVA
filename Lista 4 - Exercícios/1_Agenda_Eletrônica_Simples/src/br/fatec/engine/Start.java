package br.fatec.engine;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agenda a =  new Agenda();
		int sair = 1;
		while(sair != 0)
		{
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Agenda Eletrônica FATEC\n1 - Cadastro de contatos\n2 - Exibir Contatos\n3 - Editar Contatos\n4 - Deletar Contatos\n0 - SAIR"));
			switch(opcao)
			{			
			case 1:
				int escolhaC = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de contatos!\nInsira:\n1 para cadastrar Professores:\n2 para cadastrar Alunos: "));
				if(escolhaC == 1)
				{
					a.cadastroProfessor();
				}
				if(escolhaC == 2)
				{
					a.cadastroAluno();
				}
				if(escolhaC != 1 && escolhaC != 2) 
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 2:
				int escolhaE = Integer.parseInt(JOptionPane.showInputDialog("Exibição de contatos!\nInsira:\n1 para Exibir dados dos Professores:\n2 para Exibir Alunos: "));
				if(escolhaE == 1)
				{
					a.listarTodosProfessores();
				}
				if(escolhaE == 2)
				{
					a.listarTodosAlunos();
				}
				if(escolhaE != 1 && escolhaE != 2) 
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 3:
				int escolhaEdit = Integer.parseInt(JOptionPane.showInputDialog("Edição de contatos!\nInsira:\n1 para Exibir dados dos Professores:\n2 para Exibir Alunos: "));
				if(escolhaEdit == 1)
				{
					a.edicaoProfessores();
				}
				if(escolhaEdit == 2)
				{
					a.edicaoAlunos();
				}
				if(escolhaEdit != 1 && escolhaEdit != 2) 
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 4:
				int escolhaD = Integer.parseInt(JOptionPane.showInputDialog("Exclusão de contatos!\nInsira\n1 para Exibir dados dos Professores:\n2 para Exibir Alunos: "));
				if(escolhaD == 1)
				{
					a.removerProf();;
				}
				if(escolhaD == 2)
				{
					a.removerAlunos();;
				}
				if(escolhaD != 1 && escolhaD != 2) 
				{
					JOptionPane.showMessageDialog(null, "ERROR! Insira um valor correto!");
				}
				break;
			case 0:
				sair = 0;
				break;				
			}
		}
	}
}
