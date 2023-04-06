package br.com.fiap.pratica.ifelse;

public class ExemploIfElse 
{
	public static void main(String[] args) 
	{
		//declarar uma variavel do tipo int
		
		//verificar se o valor da variavel eh par ou impar
		
		int x = 5;
		
		if ((x % 2) == 0)
		{
			System.out.println("X e par");
		}
		else
			{
				System.out.println("X e impar");
			}
		
		//Verificar se o valor eh maior do que 20 ou menor do que 5
		if (x > 20 || x < 5)
		{
			System.out.println("valor eh maior do que 20 ou menor do que 5");
		}
				
		//Verificar se o numero eh maior do que 10
		else if (x > 10)
		{
		
			System.out.println("numero eh maior do que 10 e menor que 21");
		}
		
		// exibir o intervalo do valor
		else
		{
			System.out.println("Valor esta entre 5 e 10");
		}
		
		
	}
}
