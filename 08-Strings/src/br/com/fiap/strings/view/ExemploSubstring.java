package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class ExemploSubstring {
	
	public static void main(String[] args) {
		
		// Ler um nome completo, com JOptionPane
		
//		String nome1 = JOptionPane.showInputDialog("Digite seu nome completo: ");
//		
//		//Exibir o nome
//		String substringNome = nome1.substring(0, nome1.indexOf(" "));
//		
//		JOptionPane.showMessageDialog(null, substringNome);
//		
//		//Exibir o sobrenome
//		String substringSobreNome = nome1.substring(nome1.indexOf(" "));
//		
//		JOptionPane.showMessageDialog(null, substringSobreNome);
		
		
//		// Ler uma data (dd/mm/aaaa)
//		String data1 = JOptionPane.showInputDialog("Digite a data: dd/mm/aaaa ");
//		
//		
//		// Exibir dia
//		String substringDia = data1.substring(0, data1.indexOf("/"));
//		JOptionPane.showMessageDialog(null, substringDia);
//		
//		
//		//Exibir mes
//		String substringMes = data1.substring(data1.indexOf("/") + 1, data1.lastIndexOf("/"));
//		JOptionPane.showMessageDialog(null, substringMes);
//		
//		
//		// Exibir ano
//		String substringAno = data1.substring(data1.lastIndexOf("/") + 1);
//		JOptionPane.showMessageDialog(null, substringAno);
		
		
		//Ler um email
		String email1 = JOptionPane.showInputDialog("Digite seu email: ");
	
		
		//Exibir o dominio do email
		String substringDominio = email1.substring(email1.indexOf("@") + 1, email1.lastIndexOf("."));
		JOptionPane.showMessageDialog(null, substringDominio);
		
		
		
		
		
	}

}
