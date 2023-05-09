package br.com.fiap.heranca.model;

public class Professor extends Pessoa {

	private double salario;
	private int cargaHoraria;
	
	public Professor(int codigo, String nome, String cpf, Endereco endereco, 
			double salario, int cargaHoraria)
	{
		super(codigo, nome, cpf, endereco); // igualmente ai this(), a chamada do construtor pai deve estar na 1a linha
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
	}
	

	public void aplicarProva() {

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
