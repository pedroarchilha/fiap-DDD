package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Replace {
	
	public static void main(String[] args) {
		
//		String x = JOptionPane.showInputDialog("Digite qualquer coisa: ");
//		
//		String semVogal = x.replace("a", "*").replace("e", "*").replace("i", "*").replace("o", "*").replace("u", "*");
//		
//		
//		JOptionPane.showMessageDialog(null, semVogal);
		
		// Usando while
		
		String x = JOptionPane.showInputDialog("Digite qualquer coisa: ");
		
		// criando laco de repeticao
		
		String vogais = "aeiou";
		
		for (int i = 0; i < vogais.length(); i++)
		{
			x = x.replace(vogais.charAt(i), '*'); //usar aspas simples devido o charAt q eh baseado em um unico char
		}
		
		
		JOptionPane.showMessageDialog(null, x);

		
		
	}

}
