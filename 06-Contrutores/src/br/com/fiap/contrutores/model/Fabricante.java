package br.com.fiap.contrutores.model;

public class Fabricante 
{
	
	private String nome;
	private String cnpj;
	
	
	// criar um construtor
	
	public Fabricante(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public Fabricante(String nome) { // com isso, estamos obrigando o objeto Fabricante a ter no MINIMO o nome
									 // no default, ele traria null para String, mas com o construtor, obriga a criacao de parametros.
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
