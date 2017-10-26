package br.fatec.estoque;

import java.util.ArrayList;

public class Produto {
	
	String nome_produto;
	int qtde_produto;
	ArrayList<Produto> produtos;
	
	public Produto(String nome_produto, int qtde_produto)
	{
		this.nome_produto = nome_produto;
		this.qtde_produto = qtde_produto;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public int getQtde_produto() {
		return qtde_produto;
	}

	public void setQtde_produto(int qtde_produto) {
		this.qtde_produto = qtde_produto;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

}
