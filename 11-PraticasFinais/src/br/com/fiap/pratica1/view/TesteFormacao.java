package br.com.fiap.pratica1.view;

import javax.swing.JOptionPane;

import br.com.fiap.pratica1.model.Bacharelado;
import br.com.fiap.pratica1.model.Medio;
import br.com.fiap.pratica1.model.Tecnologo;

public class TesteFormacao {

	public static void main(String[] args) {
		
		//Perguntar qual tipo de formacao sera cadastradas
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(
				"Qual a formacao desejada entre \n1- Bacharelado \n2-Medio e \n3-Tecnologo: "));
		
		
		
		//Passar informacoes do curso bacharelado
		if(escolha == 1)
		{
			Bacharelado curso1 = new Bacharelado();
			curso1.setDescricao(JOptionPane.showInputDialog("Descrição: "));
			
			
		}
		
		//Passar informacoes do curso Medio
		if(escolha == 2)
		{
			Medio curso1 = new Medio();
		}
		
		
		//Passar informacoes do curso Tecnologo
		if(escolha == 3)
		{
			Tecnologo curso1 = new Tecnologo();
		}
		
		
		
		//Pedir as informacoes da formacao
		
		
		//Exibir os dados da formacao

	}
}
