package br.fatec.estoque;

import java.util.ArrayList;

//BIBLIOTECAS PARA CRIAR E LER ARQUIVO
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import javax.swing.JOptionPane;

public class Gerenciador {
	
	private String nome_produto;
	private int qtde_produto;
	ArrayList<Produto> produtos = new ArrayList<>();	
	
	public void cadastroProduto()
	{
		int qtde_cadastro = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de Produtos\nInsira a quantos produtos deseja cadastrar: "));
		for(int i = 0; i < qtde_cadastro; i++)
		{
			Produto p = new Produto(nome_produto, qtde_produto);
			p.setNome_produto(JOptionPane.showInputDialog("Insira o nome do Produto: "));
			p.setQtde_produto(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade do "+p.getNome_produto()+": ")));
			produtos.add(p);
			JOptionPane.showMessageDialog(null, "Produto cadastrado com Sucesso!");
		}
	}
	
	public void exibirProduto()
	{
		for(Produto x : produtos)
		{
			JOptionPane.showMessageDialog(null, x.getNome_produto()+" "+x.getQtde_produto());
		}
	}
	
	public void editarProduto()
	{
		int cont = 1;
		JOptionPane.showMessageDialog(null, "Editar dados dos Produtos!");
		for(Produto p: produtos)
		{
			System.out.println("["+cont+"]"+"Nome do Produto: "+p.getNome_produto()+"\n");
			cont++;
		}		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente ao produto que deseja editar: "));
		
		System.out.println("\nProduto Selecionado\n["+escolha+"]"+"Nome do Produto: "+produtos.get(escolha-1).getNome_produto()+"\nQuantidade: "+produtos.get(escolha-1).getQtde_produto()+"\n");
		int escolhaX = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente ao dado do produto que deseja editar!\n1-Nome\n2-Quantidade"));
		
		if(escolhaX == 1)
		{
			String novo_nome = JOptionPane.showInputDialog("Insira o novo Nome: ");
			produtos.get(escolha-1).setNome_produto(novo_nome);
			
		}
		if(escolhaX == 2)
		{
			int nova_qtde = Integer.parseInt(JOptionPane.showInputDialog("Insira a nova quantidade: "));
			produtos.get(escolha-1).setQtde_produto(nova_qtde);
		}
		JOptionPane.showMessageDialog(null, "Produto Editado com Sucesso!");
	}
	
	public void removerProduto()
	{
		int cont = 1;
		JOptionPane.showMessageDialog(null, "Remover Produto!");
		for(Produto p: produtos)
		{
			System.out.println("["+cont+"]"+"Nome do Produto: "+p.getNome_produto());
			cont++;
		}		
		int escolhaR = Integer.parseInt(JOptionPane.showInputDialog("Insira o nº correspondente do contato que deseja Remover!"));
		
		produtos.remove(escolhaR-1);
		JOptionPane.showMessageDialog(null, "Produto Removido com Sucesso!");
		
		for(Produto x : produtos)
		{
			System.out.println("\nNome do Produto: "+x.getNome_produto()+" "+"Quantidade: "+x.getQtde_produto());
		}
	}
	
	public void criarArquivo()
	{
		File caminhoP = new File("C:\\Users\\kseve\\Desktop\\Produtos.txt");
		try
		{
			FileWriter fw = new FileWriter(caminhoP);
			Writer saida = new BufferedWriter(fw);

			for(int i = 0; i < produtos.size(); i++)
			{
				saida.write(produtos.get(i).getNome_produto().toString() +";"+produtos.get(i).getQtde_produto()+";"+"\n");
			}			
			saida.close();
			JOptionPane.showMessageDialog(null, "Dados Gravados com Sucesso!");
		}
		catch(Exception erro)
		{
			JOptionPane.showMessageDialog(null, erro);
		}		
	}
	public void lerArquivo() throws IOException
	{
		String linha;
		String caminhoP = "C:\\Users\\kseve\\Desktop\\Produtos.txt";
		ArrayList<String> produtos = new ArrayList<>();
		try
		{
			BufferedReader entrada = new BufferedReader(new FileReader(caminhoP));
			if(!entrada.ready())
			{
				throw new IOException();
			}
			while((linha = entrada.readLine()) != null)
			{
				produtos.add(linha);
			}
			entrada.close();
			JOptionPane.showMessageDialog(null, "Dados Lidos com Sucesso!");
		}
		catch(IOException erro)
		{
			System.out.println(erro);
		}
		
		int tam = produtos.size();
		for(int c = 0; c < 1; c++)
		{
			
			for (int i = 0; i < tam; i++)
			{
				String dados = (produtos.get(i));
				//UTILIZA-SE O REPLACE PARA SEPARAR OS DADOS NA EXIBIÇÃO
				dados = dados.replace(";", "           ");
				JOptionPane.showMessageDialog(null, "Produto          Quantidade\n"+dados);
			}
		}
	}
}