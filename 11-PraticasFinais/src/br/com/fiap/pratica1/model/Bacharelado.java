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
	}1

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
		return (duracao * fator * 600) + (cargaHoraria * 12);

	}

	public void definirDuracao() {
		if (descricao.toLowerCase().contains("engenharia")) {
			duracao = 60;
		} else {
			duracao = 48;
		}
	}

	public String toString() {
		return "Bacharelado [projetoConclusao=" + projetoConclusao + ", cargaHoraria=" + cargaHoraria + ", descricao="
				+ descricao + ", duracao=" + duracao + "]";
	}

	// ************************************************************************************************************//
// 										Getters and Setters 													   //
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
