package br.fatec.engine;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.fatec.modelo.Aluno;
import br.fatec.modelo.Professor;

public class Agenda {
	
	private String nome;
	private String email;
	private String telefone;
	private String numeroMatricula;
	
	private String numeroRegistro;
	private String qtdeHoraAula;
	
	
	ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Professor> professores = new ArrayList<>();
		
	//CADASTRO DOS ALUNOS
	public void cadastroAluno()
	{		
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Alunos!\nInsira a quantidade de Alunos que deseja Cadastrar: "));
		
		for(int i = 0; i < qtde; i++)
		{
			Aluno alu = new Aluno(nome, email, telefone, numeroMatricula);
			alu.setNome(JOptionPane.showInputDialog("Nome: "));
			alu.setEmail(JOptionPane.showInputDialog("Email: ")); 		
			alu.setTelefone(JOptionPane.showInputDialog("Telefone: ")); 	
			alu.setNumeroMatricula(JOptionPane.showInputDialog("Nº de Matrícula: "));		
			alunos.add(alu);
			JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!");
		}		
	}
	//CADASTRO DOS PROFESSORES
	public void cadastroProfessor()
	{
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Alunos!\nInsira a quantidade de Alunos que deseja Cadastrar: "));		
		for(int i = 0; i < qtde; i++)
		{
			Professor prof = new Professor(nome, email, telefone, numeroRegistro, qtdeHoraAula);		
			prof.setNome(JOptionPane.showInputDialog("Nome: "));
			prof.setEmail(JOptionPane.showInputDialog("Email: "));
			prof.setTelefone(JOptionPane.showInputDialog("Telefone: "));
			prof.setNumeroRegistro(JOptionPane.showInputDialog("Nº de Registro: "));
			prof.setQtdeHoraAula(JOptionPane.showInputDialog("Quantidade de Hora/Aula: "));
			professores.add(prof);
			JOptionPane.showMessageDialog(null, "Professor Cadastrado com Sucesso!");
		}
	}
	//LISTAGEM DOS ALUNOS
	public void listarTodosAlunos()
	{
		JOptionPane.showMessageDialog(null, "Lista de contatos de Alunos");
		for(Aluno a: alunos)
		{
			JOptionPane.showMessageDialog(null, "Nome: "+a.getNome()+
					"\nEmail: "+a.getEmail()+"\nTelefone: "+a.getTelefone()+"\nNº de Matrícula: "+a.getNumeroMatricula());
		}
	}
	//LISTAGEM DOS PROFESSORES
	public void listarTodosProfessores()
	{
		JOptionPane.showMessageDialog(null, "Lista de contatos de Professores");
		for(Professor p: professores)
		{
			JOptionPane.showMessageDialog(null, "Nome: "+p.getNome()+
					"\nEmail: "+p.getEmail()+"\nTelefone: "+p.getTelefone()+"\nNº de Registo: "+p.getNumeroRegistro()
					+"\nQuantidade de Hora/Aula: "+p.getQtdeHoraAula());
		}
	}
	//EDITAR OS DADOS DOS ALUNOS
	public void edicaoAlunos()
	{
		int cont = 1;
		JOptionPane.showMessageDialog(null, "Editar dados dos Alunos!");
		for(Aluno a: alunos)
		{
			System.out.println("["+cont+"]"+"Nome: "+a.getNome()+"\nNº de Matrícula: "+a.getNumeroMatricula()+"\n");
			cont++;
		}
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente ao contato que deseja editar: "));
		System.out.println("["+escolha+"]"+"Nome: "+alunos.get(escolha-1).getNome()+"\nEmail: "+alunos.get(escolha-1).getEmail()+"\nTelefone: "+alunos.get(escolha-1).getTelefone()
				+"\nNº de Matrícula: "+alunos.get(escolha-1).getNumeroMatricula()+"\n");
		
		int escolhaX = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente ao dado do contato que deseja editar!\n1-Nome\n2-Email\n3-Telefone"));
		
		if(escolhaX == 1)
		{
			String novo_nome = JOptionPane.showInputDialog("Insira o novo Nome: ");
			alunos.get(escolha-1).setNome(novo_nome);
			
		}
		if(escolhaX == 2)
		{
			String novo_email = JOptionPane.showInputDialog("Insira o novo Email: ");
			alunos.get(escolha-1).setEmail(novo_email);
		}
		if(escolhaX == 3)
		{
			String novo_telefone = JOptionPane.showInputDialog("Insira o novo Telefone: ");
			alunos.get(escolha-1).setTelefone(novo_telefone);
		}	
		
	}
	//EDITAR OS DADOS DOS PROFESSORES
	public void edicaoProfessores()
	{
		JOptionPane.showMessageDialog(null, "Editar dados dos Professores!");
		int cont = 1;
		
		for(Professor p: professores)
		{
			System.out.println("["+cont+"]"+"Nome: "+p.getNome()+"\nNº de Registro: "+p.getNumeroRegistro()+"\nQuantidade de Hora/Aula: "+p.getQtdeHoraAula());
			cont++;
		}
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente ao contato que deseja editar: "));
		System.out.println("["+escolha+"]"+"Nome: "+professores.get(escolha-1).getNome()+"\nNº de Matrícula: "+professores.get(escolha-1).getEmail()+"\nTelefone: "+professores.get(escolha-1).getTelefone()
				+"\nNº de Registro: " +professores.get(escolha-1).getNumeroRegistro()+"\nQuantidade de Hora/Aula:"+professores.get(escolha-1).getQtdeHoraAula()+"\n");
		
		int escolhaX = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente ao dado do contato que deseja editar!\n1-Nome\n2-Email\n3-Telefone\n4-Quantidade de Hora/Aula"));
		
		if(escolhaX == 1)
		{
			String novo_nome = JOptionPane.showInputDialog("Insira o novo Nome: ");
			professores.get(escolha-1).setNome(novo_nome);
			
		}
		if(escolhaX == 2)
		{
			String novo_email = JOptionPane.showInputDialog("Insira o novo Email: ");
			professores.get(escolha-1).setEmail(novo_email);
		}
		if(escolhaX == 3)
		{
			String novo_telefone = JOptionPane.showInputDialog("Insira o novo Telefone: ");
			professores.get(escolha-1).setTelefone(novo_telefone);
		}
		if(escolhaX == 4)
		{
			String nova_qtde_hora_aula = JOptionPane.showInputDialog("Insira a nova Quantidade de Hora/Aula: ");
			professores.get(escolha-1).setQtdeHoraAula(nova_qtde_hora_aula);
		}
	}
	//REMOÇÃO DOS ALUNOS
	public void removerAlunos()
	{
		JOptionPane.showMessageDialog(null, "Remoção de contatos! - Alunos");
		int cont = 1;		
		for(Aluno a: alunos)
		{
			System.out.println("["+cont+"]"+"Nome: "+a.getNome()+"\nNº de Matrícula: "+a.getNumeroMatricula()+"\n");
			cont++;
		}
		
		int escolhaR = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente do contato que deseja Remover!"));
		
		alunos.remove(escolhaR-1);
		JOptionPane.showMessageDialog(null, "Contato Removido com Sucesso!");
	}
	//REMOÇÃO DOS PROFESSORES
	public void removerProf()
	{
		JOptionPane.showMessageDialog(null, "Remoção de contatos! - Professores");
		int cont = 1;		
		for(Professor p: professores)
		{
			System.out.println("["+cont+"]"+"Nome: "+p.getNome()+"\nNº de Registro: "+p.getNumeroRegistro()+"\n");
			cont++;
		}
		
		int escolhaR = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente do contato que deseja Remover!"));
		
		professores.remove(escolhaR-1);
		JOptionPane.showMessageDialog(null, "Contato Removido com Sucesso!");
	}
}

