package br.com.fiap.pratica1.model;

public class Cor {

	private String nome;
	private int r;
	private int g;
	private int b;

	
	public Cor()
	{
		
	}
	
	public Cor(String nome, int r, int g, int b)
	{
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void alterarCor(int r, int g, int b, String nome) {
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
