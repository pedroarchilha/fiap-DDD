package br.com.fiap.pratica1.model;

public class Tecnologo extends Formacao {
	private boolean planoEstendido;

	
	// ************************************************************************************************************//
	//                                           Construtores													   //
	// ************************************************************************************************************//
	
	public Tecnologo() {
		super();
	}

	public Tecnologo(boolean planoEstendido) {
		super();
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}1

	// ************************************************************************************************************//
	// 											Metodos 														   //
	// ************************************************************************************************************//
	
	public double calcularMensalidade(double fator) {
		double mensal = duracao * fator * 600;
		return mensal;
	}
	
	public void definirDuracao(int duracao)
	{
		duracao = 24;
		this.duracao = duracao;
	}


	// ************************************************************************************************************//
	// 										Getter and Setters 													   //
	// ************************************************************************************************************//
	
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}	
	
	
}