package br.fatec.engine;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.fatec.modelo.Aluno;
import br.fatec.modelo.Professor;

//BIBLIOTECAS PARA CRIAR E LER ARQUIVO
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class Agenda {
	
	private String nome;
	private String email;
	private String telefone;
	private String numeroMatricula;
	
	private String numeroRegistro;
	private String qtdeHoraAula;	
	
	ArrayList<Aluno> alunos = new ArrayList<>();
	ArrayList<Professor> professores = new ArrayList<>();
	
	//CRIAR ARQUIVO TXT DO ALUNO E PROFESSOR
	public void criarArquivo() throws IOException
	{
		int escolhaCA = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Exportar dados do Professor\n2 - Exportar dados do Aluno\nInsira:"));
		if(escolhaCA == 1)
		{
			//COM O TRY/CATCH IRA MOSTRAR QUAL O ERRO ESTA OCORRENDO NA TELA
			File caminhoP = new File("C:\\Users\\kseve\\Desktop\\Professores.txt");
			try
			{
				FileWriter fw = new FileWriter(caminhoP);
				Writer saida = new BufferedWriter(fw);

				for(int i = 0; i < professores.size(); i++)
				{
					saida.write(professores.get(i).getNome().toString() +";"+ professores.get(i).getEmail().toString() 
							+";"+ professores.get(i).getTelefone().toString() +";"+ professores.get(i).getNumeroRegistro().toString()+";"+
							professores.get(i).getQtdeHoraAula().toString()+"\n");
				}			
				saida.close();
				JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
			}
			catch(Exception erro)
			{
				JOptionPane.showMessageDialog(null, erro);
			}		
		}
		if(escolhaCA == 2)
		{
			//COM O TRY/CATCH IRA MOSTRAR QUAL O ERRO ESTA OCORRENDO NA TELA
			File caminhoA = new File("C:\\Users\\kseve\\Desktop\\Alunos.txt");
			try
			{
				FileWriter fw = new FileWriter(caminhoA);
				Writer saida = new BufferedWriter(fw);

				for(int i = 0; i < alunos.size(); i++)
				{
					saida.write(alunos.get(i).getNome().toString() +";"+ alunos.get(i).getEmail().toString() 
							+";"+ alunos.get(i).getTelefone().toString() +";"+ alunos.get(i).getNumeroMatricula().toString()+"\n");
				}			
				saida.close();
				JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
			}
			catch(Exception erro)
			{
				JOptionPane.showMessageDialog(null, erro);
			}		
		}
		else
		{
			JOptionPane.showMessageDialog(null, "ERRO! Insira um valor correto!");
		}
	}
	
	//METODO PARA LER O ARQUIVO DE PROFESSOR E ALUNO
	@SuppressWarnings("resource")
	public void lerArquivo() throws IOException, ClassNotFoundException
	{
		int escolhaLA = Integer.parseInt(JOptionPane.showInputDialog("\n1 - Importar dados do Professor\n2 - Importar dados do Aluno\nInsira:"));
		String linha;
		
		if(escolhaLA == 1)
		{
			String caminhoP = "C:\\Users\\kseve\\Desktop\\Professores.txt";
			ArrayList<String> professores = new ArrayList<>();
			try
			{
				BufferedReader entrada = new BufferedReader(new FileReader(caminhoP));
				if(!entrada.ready())
				{
					throw new IOException();
				}
				while((linha = entrada.readLine()) != null)
				{
					professores.add(linha);
				}
				entrada.close();
				JOptionPane.showMessageDialog(null, "Dados Lidos com Sucesso!");
			}
			catch(IOException erro)
			{
				System.out.println(erro);
			}
			
			int tam = professores.size();
			for (int i = 0; i < tam; i++)
			{
				String dados = (professores.get(i));
				//UTILIZA-SE O REPLACE PARA SEPARAR OS DADOS NA EXIBIÇÃO
				dados = dados.replace(";", " ");
				System.out.println(dados);
			}
		}
		if(escolhaLA == 2)
		{
			String caminhoA = "C:\\Users\\kseve\\Desktop\\Alunos.txt";
			ArrayList<String> alunos = new ArrayList<>();
			
			try
			{
				BufferedReader entrada = new BufferedReader(new FileReader(caminhoA));
				if(!entrada.ready())
				{
					throw new IOException();
				}
				while((linha = entrada.readLine()) != null)
				{
					alunos.add(linha);
				}
				entrada.close();
				JOptionPane.showMessageDialog(null, "Dados Lidos com Sucesso!");
			}
			catch(IOException erro)
			{
				System.out.println(erro);
			}
			
			int tam = alunos.size();
			for (int i = 0; i < tam; i++)
			{
				String dados = (alunos.get(i));
				//UTILIZA-SE O REPLACE PARA SEPARAR OS DADOS NA EXIBIÇÃO
				dados = dados.replace(";", " ");
				System.out.println(dados);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "ERRO! Insira um valor correto!");
		}		
	}
	
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
		}		
	}
	//CADASTRO DOS PROFESSORES
	public void cadastroProfessor()
	{
		JOptionPane.showMessageDialog(null, "Cadastro de Professores!");
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
