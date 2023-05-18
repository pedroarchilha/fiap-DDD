package br.com.fiap.pratica1.model;

public class Tecnologo extends Formacao {
	private boolean planoEstendido;

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
	}

	public double calcularMensalidade(double fator) {
		double mensal = duracao * fator * 600;
		return mensal;
	}
}