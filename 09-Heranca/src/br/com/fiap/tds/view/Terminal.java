package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.model.livro.Livro;

public class Terminal {
	
	public static void main(String[] args) 
	{
		Livro livro = new Livro(123, "Tudo sobre Churros");
		
		JOptionPane.showMessageDialog(null, livro.getTitulo());
		
	}

}
