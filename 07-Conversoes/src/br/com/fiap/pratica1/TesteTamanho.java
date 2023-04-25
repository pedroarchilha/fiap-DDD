package br.com.fiap.pratica1;

import javax.swing.JOptionPane;

public class TesteTamanho 
{
	public static void main(String[] args) 
	{
		// Pessoa 1
		String pessoa1 = JOptionPane.showInputDialog("Digite o nome da priemira pessoa: ");
		String peso1 = JOptionPane.showInputDialog("Digite o peso da primeira pessoa: ");
		String altura1 = JOptionPane.showInputDialog("Digite a altura da priemira pessoa: ");
		
		// Pessoa 2
		String pessoa2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa: ");
		String peso2 = JOptionPane.showInputDialog("Digite o peso da segunda pessoa: ");
		String altura2 = JOptionPane.showInputDialog("Digite a altura da segunda pessoa: ");
		
		
		// conversoes
		double peso1Int = Double.parseDouble(peso1);
		double altura1Int = Double.parseDouble(altura1);
		double peso2Int = Double.parseDouble(peso2);
		double altura2Int = Double.parseDouble(altura2);
		
		
		if (peso1Int > peso2Int)
		{
			JOptionPane.showMessageDialog(null, "A pessoa mais pesada eh: " + pessoa1);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "A pessoa mais pesada eh: " + pessoa2);
		}
		
		if (altura1Int > altura2Int)
		{
			JOptionPane.showMessageDialog(null, "A pessoa mais alta eh: " + pessoa1);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "A pessoa mais alta eh: " + pessoa2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
