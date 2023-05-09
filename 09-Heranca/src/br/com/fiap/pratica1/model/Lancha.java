package br.com.fiap.pratica1.model;

public class Lancha extends CommonAttributes {

	private int quantidadeMotores;

	
	public Lancha()
	{
		
	}
	
	public Lancha(String modelo, int quantidadeLugares, double comprimento, 
			int anoFabricacao, Cor cor, int quantidadeMotores)
	{
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		this.quantidadeMotores = quantidadeMotores;
	}
	
	
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
}