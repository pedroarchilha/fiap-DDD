package br.com.fiap.motors.model;

public class View {

	//main -> CTRL + espaco
	public static void main(String[] args) {
		//Instanciar o Carro
		Carro gol = new Carro();
		
		//Colocar informacoes nos atributos
		gol.ano = 1999;
		gol.modelo = "Gol Bola";
		gol.valor = 15000;
		
		//Calcular a idade do carro
		int i = gol.calcularIdade(2023);
		gol.atualizarValor(0.2);
		
		//Exibir a idade
		System.out.println("Idade do carro: " + i);
		System.out.println("valor do carro: " + gol.valor);
		
		double seguro = gol.calcularSeguro();
		System.out.println("O valor do carro: " + seguro);
		
		double valorParcela = gol.parcelarSeguro(3);
		
		System.out.println("Parcelando fica : " + valorParcela + " por parcela");
		
	}
}