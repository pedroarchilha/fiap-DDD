package br.com.fiap.pratica1;

import javax.swing.JOptionPane;

public class TesteEleitores 
{
	public static void main(String[] args) 
	{
		
		// Laco de repeticao
		//for(variaval de controle, condicao de parada, incremento)
		
		for(int i = 0; i < 3; i++)
		{
			
		}
		
		
		
		// Ler idade de 3 pessoas
		int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da primeira pessoa: "));
		int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da segunda pessoa: "));
		int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da terceira pessoa: "));
		
		
		int eleitorObg = 0;
		
		if (idade1 > 16 && idade1 < 66)
		{
			eleitorObg = eleitorObg + 1;
		}
		
		
		if (idade2 > 16 && idade2 < 66)
		{
			eleitorObg = eleitorObg +1;
		}
		
		if (idade3 > 16 && idade3 < 66)
		{
			eleitorObg = eleitorObg +1;
		}

		
		
		if (eleitorObg == 0)
		{
			JOptionPane.showMessageDialog(null, "Nao tivemos eleitores.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Ao total temos " + eleitorObg + " eleitor(es) obrigatorios.");
		}
			
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
