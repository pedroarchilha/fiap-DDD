package br.com.fiap.pratica1.model;

public class Bacharelado extends Formacao {
	private String projetoConclusao;
	private int cargaHoraria;

// ************************************************************************************************************//
//                                           Construtores													   //
// ************************************************************************************************************//
	public Bacharelado() {
		super();
	}

	public Bacharelado(String projetoConclusao, int cargaHoraria) {
		super();
		this.projetoConclusao = projetoConclusao;
		this.cargaHoraria = cargaHoraria;
	}

	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHoraria) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHoraria = cargaHoraria;
	}

// ************************************************************************************************************//
// 											Metodos 														   //
// ************************************************************************************************************//
	public double calcularMensalidade(double fator) {
		double mensal = (duracao * fator * 600) + (cargaHoraria * 12);
		return mensal;
	}

// ************************************************************************************************************//
// 										Getter and Setters 													   //
// ************************************************************************************************************//
	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
