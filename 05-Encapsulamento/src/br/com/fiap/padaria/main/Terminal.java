package br.com.fiap.padaria.main;
import br.com.fiap.padaria.model.Produtos;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produtos produto = new Produtos();
		
		//Ajustar para utilizar os metodos set
		produto.setNome("Pedro"); //da para colocar o leitor dentro do set
		produto.setId(550450);
		produto.setPrecoCusto(0);
		produto.setPrecoVenda(0);
		produto.setPromocao(false);
		
		System.out.println(produto.getNome());
	}

}
