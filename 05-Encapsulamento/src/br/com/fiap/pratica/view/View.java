package br.com.fiap.pratica.view;
import br.com.fiap.pratica.encapsulamento.*;

public class View 
{
	public static void main(String[] args) 
	{
		Cor roxo = new Cor();
		roxo.alterarCor(255, 0, 255, "Roxo");
		
		//Instanciar uma lancha
		
		Lancha lancha = new Lancha();
		lancha.setAnoFabricacao(2020);
		lancha.setComprimento(10);
		lancha.setCor(roxo);
		lancha.setModelo("Azimut");
		lancha.setQuantidadeLugares(8);
		lancha.setQuantidadeMotores(2);
		
		//Exibir alguns valores da lancha
		
		System.out.println(lancha.getModelo() + lancha.getQuantidadeLugares() + lancha.getQuantidadeMotores());
		
		System.out.println(lancha.getCor().getNome());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
