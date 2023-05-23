package br.com.fiap.pratica1.model;

public class Formacao {

	protected String descricao;
	private int periodo;
	private double mensalidade;
	protected int duracao; // Caso eu queira manter o private, posso usar o getAtributo para usa-lo

// ************************************************************************************************************//
//                                           Construtores													   //
// ************************************************************************************************************//
	public Formacao() {
		super();
	}

	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}1
	
	public Formacao(String descricao, int periodo)
	{
		this.descricao = descricao;
	}

// ************************************************************************************************************//
// 											Metodos 														   //
// ************************************************************************************************************//
	public void definirDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double calcularMedia(double global1, double global2) {
		return (global1 * 0.4) + (global2 * 0.6);
		
	}

	public double calcularMedia(double global1, double checkpoint1, double challenge1, double global2,
			double checkpoint2, double challenge2) {
		return ((((checkpoint1 + challenge1) * 0.2) + global1 * 0.6) * 0.4)
				+ ((((checkpoint2 + challenge2) * 0.2) + global2 * 0.6) * 0.6);
		
	}

	public double calcularMedia(double checkpoint1, double checkpoint2, double checkpoint3) {
		double mediaCP = 0;
		if (checkpoint1 >= checkpoint2 && checkpoint2 <= checkpoint3) {
			mediaCP = (checkpoint1 + checkpoint3) / 2;
		} else if (checkpoint1 >= checkpoint3 && checkpoint2 >= checkpoint3) {
			mediaCP = (checkpoint1 + checkpoint3) / 2;
		} else if (checkpoint2 >= checkpoint1 && checkpoint3 >= checkpoint1) {
			mediaCP = (checkpoint2 + checkpoint3) / 2;
		}

		return mediaCP;
	}

// ************************************************************************************************************//
// 										Getters and Setters 													   //
// ************************************************************************************************************//
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
