package br.com.fiap.tds.model.produto;

public class Produto {
	private int codigo;
	private int preco;

	public Produto(int codigo) {
		this.codigo = codigo;
	}
	
	public Produto()
	{
		
	}

	public Produto(int codigo, int preco)
	{
		this.codigo = codigo;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}
