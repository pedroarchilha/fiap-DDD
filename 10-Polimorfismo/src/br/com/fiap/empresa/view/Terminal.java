package br.com.fiap.empresa.view;

import javax.swing.JOptionPane;

import br.com.fiap.empresa.model.Funcionario;
import br.com.fiap.empresa.model.Gerente;

public class Terminal {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario(5, "Pedro", 1500, "8575934-23", "senior");
		Gerente gerente1 = new Gerente(1, "Flavio", 8000, "846384-23", "pleno", 200, "nenhum");

		// Testando funcionario
		JOptionPane.showMessageDialog(null, "Salario funcionario atual: " + func1.getSalario());

		func1.aumentaSalario("senior");

		JOptionPane.showMessageDialog(null, "Salario atualizado do funcionario: " + func1.getSalario());

		// Testando Gerente

	}

}
