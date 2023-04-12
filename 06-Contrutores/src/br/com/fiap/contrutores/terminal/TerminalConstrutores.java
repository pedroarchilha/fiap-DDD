package br.com.fiap.contrutores.terminal;

import br.com.fiap.contrutores.model.Bicicleta;
import br.com.fiap.contrutores.model.Fabricante;

public class TerminalConstrutores 
{
	public static void main(String[] args) 
	{
		Fabricante churros = new Fabricante();
		churros.setNome("Caloi");
		churros.setCnpj("999.999.999/0001-99");
			
		
		Bicicleta caloi = new Bicicleta();
		caloi.setModelo("MTX");
		caloi.setAro(21);
		caloi.setFabricante(churros);
		caloi.setPeso(3.2f); //f serve para formatar como float e evitar o erro.
		
		System.out.println(caloi.retornarDetalhes());
	}
}