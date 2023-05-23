package br.com.fiap.pratica1.model;

public class Medio extends Formacao {

	private String tipo;

// ************************************************************************************************************//
//                                           Construtores													   //
// ************************************************************************************************************//

	public Medio() {
		super();
	}

	public Medio(String tipo) {
		super();
		this.tipo = tipo;
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}1

// ************************************************************************************************************//
// 											Metodos 														   //
// ************************************************************************************************************//

	public double calcularMensalidade(double fator) {
		double mensal = duracao * fator * 500;
		return mensal;
	}
	
	public void definirDuracao(int duracao)
	{
		duracao = 36;
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "Medio [tipo=" + tipo + ", descricao=" + descricao + ", duracao=" + duracao + "]";
	}
	
	

// ************************************************************************************************************//
// 										Getters and Setters 												   //
// ************************************************************************************************************//


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
