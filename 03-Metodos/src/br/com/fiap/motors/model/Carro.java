package br.com.fiap.motors.model;

public class Carro {

	//Atributos
	String modelo;
	
	int ano;
	
	double valor;
	
	//Metodos
	//idade calcularIdade(ano atual)
	
	
	public int calcularIdade(int anoAtual) {
		//Calcular a idade
		int idade = anoAtual - ano;
		//Retornar a idade
		return idade;
	}
	
	//atualizar o valor do carro
	void atualizarValor(double porcentagem) {
		valor *= (1 + porcentagem);
		
	}

	
	//criar um moetodo que calcula e retorna o valor do seguro do carro
	//seguro do carro é baseado no valor, 5% do valor do carro
	
	double calcularSeguro() {
		double x;
		x = valor * 0.05;
		return x;
	}
	
	
	// Criar um metodo que recebe a quantidade de parcelas, calcula e retorna o valor da parcela;
	
	double parcelarSeguro(int numeroParcela) {
		double valorSeguro = calcularSeguro();
		double x = valorSeguro / numeroParcela;
		
		return x;
	}
	
}