package br.com.fiap.contrutores.model;

public class Bicicleta {
	private int aro;
	private String modelo;
	private float peso;
	private Fabricante fabricante;

	public String retornarDetalhes() {
		String detalhes = aro + " / " + modelo + " / " + peso + " / " + fabricante.getNome();

		return detalhes;
	}

	// implementar um construtor que recebe todos os atributos
	// Construtor eh como se fosse um metodo, ele PRECISA ter o mesmo
	// nome da Classe identico, porem ele nao tem retorno.

	public Bicicleta(int aro, String modelo, float peso, Fabricante fabricante) {
		this(modelo, aro); // Eh possivel chamar um construtor dentro do outro. Ele precisa estar na primeira linha, 
						   // e soh pode chamar 1 construtor dentro do outro, nao pode ser 2.
		this.aro = aro;
		this.modelo = modelo;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	
	public Bicicleta(String modelo, int aro) {
		this.modelo = modelo;
		this.aro = aro;
		
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
