package br.com.fiap.padaria.model;

public class Produtos 
{

	private int id, quantidade;
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private boolean promocao;
		
	
	public double calcularLucro() 
	{
		double lucro =  precoVenda - precoCusto;
		return lucro;
	}

	
	public void atualizarEstoque(int qtd)
	{
		quantidade += qtd;
		
	}
	
	//Getters e Setters
	public int getId()
	{
		return id;
		
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getQuantidade()
	{
		return quantidade;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public double getPrecoCusto()
	{
		return precoCusto;
	}
	
	public void setPrecoCusto(double precoCusto)
	{
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda()
	{
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda)
	{
		this.precoVenda = precoVenda;
	}

	//Quando for boolean, para o metodo do GET, da pra fazer:
	//getPromocao() ou isPromocao()
	public boolean getPromocao()
	{
		return promocao;
	}
	
	public void setPromocao(boolean promocao)
	{
		this.promocao = promocao;
	}
	
	
	
	
	
	
	
	
}
