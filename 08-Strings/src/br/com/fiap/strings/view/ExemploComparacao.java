package br.com.fiap.strings.view;

public class ExemploComparacao {
	
	public static void main(String[] args) {
		
		//declarar duas Strings
		
		String nome1 = "Fiap";
//		String nome2 = "Fiap";
		String nome2 = new String("FIAP"); // nesse caso, mesmo se eu instanciar um novo objeto, ele vai comprar a String.
		//se usar ==, usando new String, java mostra q eh diferente
		
		//Verificar se as variaveis sao iguais
		
		//1a opcao
		//System.out.println(nome1.equals(nome2));
		
		//2a opcao
		if (nome1.equals(nome2))
		{
			System.out.println("Eh igual");
		}
		else
		{
			System.out.println("Diferente");
		}
		
		
		
		//Verificar se as Strings sao iguais, ignorando maiuscula ou minuscula
		
		String nome3 = "bola";
		String nome4 = "BOLA";
		
		if (nome3.equalsIgnoreCase(nome4))
		{
			System.out.println("Eh igual");
		}
		else
		{
			System.out.println("Diferente");
		}
		
		//Imprimir a quantidade de letras da variavel nome1
		
		System.out.println("A quantidade de char que tem na variavel nome1 eh: " + nome1.length());
		
		//Validar se o nome possui menos do que 20 caracteres
		
		if (nome1.length() <= 20)
		{
			System.out.println("Variavel tem 20 ou menos char.");
		}
		else
		{
			System.out.println("Variavel tem mais que 20 char.");
		}
		
		
	}

}
