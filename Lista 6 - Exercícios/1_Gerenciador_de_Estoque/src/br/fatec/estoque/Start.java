package br.fatec.estoque;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Gerenciador g = new Gerenciador();
		//g.cadastroProduto();
		//g.criarArquivo();
		g.lerArquivo();
		int sair = 1;
		while(sair != 0)
		{
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Controlador de Estoque\n1 - Cadastro de produtos\n2 - Exibir produtos\n3 - Editar Contatos\n4 - Deletar produtos\n5 - Criar Arquivo txt\n6 - Importar Arquivo\n0 - SAIR"));
			switch(opcao)
			{			
			case 1:
				g.cadastroProduto();
				break;
			case 2:
				g.exibirProduto();
				break;
			case 3:
				g.editarProduto();
				break;
			case 4:
				g.removerProduto();
				break;
			case 5:
				g.criarArquivo();
				break;
			case 6:
				g.lerArquivo();
				break;
			case 0:
				sair = 0;
				break;				
			}
		}
		
	}

}
