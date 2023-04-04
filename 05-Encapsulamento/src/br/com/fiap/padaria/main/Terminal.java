package br.com.fiap.padaria.main;
import br.com.fiap.padaria.model.Produtos;

public class Terminal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Produtos produto = new Produtos();
		
		//Ajustar para utilizar os metodos set
		produto.setNome("Livro Java"); //da para colocar o leitor dentro do set
		produto.setId(550450);
		produto.setPrecoCusto(50);
		produto.setPrecoVenda(200);
		produto.setPromocao(true);
		produto.atualizarEstoque(10);
		
		//Exibir os atributos
		System.out.println(produto.getNome());
		System.out.println(produto.getId());
		System.out.println(produto.getPrecoCusto());
		System.out.println(produto.getPrecoVenda());
		System.out.println(produto.getPromocao());
		System.out.println(produto.getQuantidade());
		
		// Exibir o valor do lucro do produto
		double churros = produto.calcularLucro();
		System.out.println("Lucrl:" + churros);
		
		
	}

}
