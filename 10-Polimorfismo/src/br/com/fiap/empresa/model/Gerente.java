package br.com.fiap.empresa.model;

public class Gerente extends Funcionario {

	private double bonus;
	private String beneficios;

	// Sobrescrever o metodo aumentarsalario por nivel
	// Junior 10000; Pleno 14000, senior 30000

	public boolean aumentaSalario(String nivel) {
		boolean aumentou = false;
		if (nivel.equalsIgnoreCase("junior") && salario < 10000) {
			salario = 10000;
			aumentou = true;
		}
		if (nivel.equalsIgnoreCase("pleno") && salario < 14000) {
			salario = 14000;
			aumentou = true;
		}
		if (nivel.equalsIgnoreCase("senior") && salario < 30000) {
			salario = 30000;
			aumentou = true;
		}
		return aumentou;
	}
	
	
	//Subscrever o metodo aumentarSalario que recebe o double
	//Aumentar o salario de acordo com porcentagem e aumentar o bonus a %
	
	public void aumentarSalario(double porcentagem) {
		bonus *= porcentagem/100 + 1;
		super.aumentaSalario(porcentagem);
		
	}
	
	
	
	

	public Gerente(int id, String nome, double salario, String cpf, 
			String nivel, double bonus, String beneficios) {
		super(id, nome, salario, cpf, nivel);
		this.bonus = bonus;
		this.beneficios = beneficios;
	}

	public Gerente() {
		super();
	}

	public Gerente(double bonus, String beneficios) {
		super();
		this.bonus = bonus;
		this.beneficios = beneficios;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

}
