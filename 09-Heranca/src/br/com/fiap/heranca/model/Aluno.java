package br.com.fiap.heranca.model;

public class Aluno extends Pessoa {

	private int rm;
	private String turma;

	
	public Aluno()
	{
		//pode ficar vazio, pois chama o construtor do pai
	}
	
	public Aluno(int codigo, String nome, String cpf, Endereco endereco, 
			int rm, String turma)
	{
		super(codigo, nome, cpf, endereco);
		this.rm = rm;
		this.turma = turma;
		
		
	}
	
	public void estudar() {

	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

}
