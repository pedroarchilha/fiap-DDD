package br.com.fiap.empresa.model;

public class Funcionario {

	private int id;
	private String nome;
	private double salario;
	private String cpf;
	private String nivel;

	// Aumenta o salario em 2%
	public void aumentaSalario(float salario) {
		this.salario += salario * 0.02;

	}

	// Aumenta o salario com %
	public void aumentaSalario(double porcentagem) {
		double percent = porcentagem / 100;
		this.salario += this.salario * percent;

	}

	// Aumenta o salario: junior(2000), Pleno (5000), Senior (8000)
	public void aumentaSalario(String nivel) {
		if(nivel.equalsIgnoreCase("junior"))
		{
			this.salario += 2000;
		}
		else if(nivel.equalsIgnoreCase("pleno"))
		{
			this.salario += 5000;
		}
		else if(nivel.equalsIgnoreCase("senior"))
		{
			this.salario += 8000;
		}

	}

	public Funcionario() {
		super();
	}

	public Funcionario(int id, String nome, double salario, String cpf, String nivel) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
		this.nivel = nivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
