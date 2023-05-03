package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Replace {
	
	public static void main(String[] args) {
		
		String x = JOptionPane.showInputDialog("Digite qualquer coisa: ");
		
		String normal = x.replaceAll("[a, e, i, o, u]", "*");
		
		
		System.out.println(normal);
		
	}

}
