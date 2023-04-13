package br.com.fiap.construtores.pratica1;

public class View 
{

	public static void main(String[] args) 
	{
		
		
		Funcionario joao = new Funcionario("Joao");
		
		Profissao tiGuy = new Profissao("TI Guy");
		
		
		
		System.out.println(joao.getNome() + " " + tiGuy.getNome());
		
		System.out.println(joao.exibirDados());
		
		
		
		
	}

	
}
