package br.com.fiap.pratica.pratica2;

public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	
	//Validar dia
	private int validarDia(int dia)
	{
		this.dia = dia;
		if (dia > 31 || dia < 1)
		{
			dia = 1;
		}
		return dia;
	}
	
	//Validar mes
	private int validarMes(int mes)
	{
		this.mes = mes;
		if (mes > 12 || mes < 1)
		{
			mes = 1;
		}
		return mes;
	}
	
	//Validar ano
	private int validarAno(int ano)
	{
		this.ano = ano;
		if (ano < 0)
		{
			ano = 2023;
		}
		return ano;
	}
	
	public String retornarData(int dia, int mes, int ano)
	{
		String dataString = (dia + "/" + mes + "/" + ano); 
		return dataString;
	}
	
	public String retornarMes(int mes)
	{
		String mesValor = null;
		
		if (mes == 1)
		{
			mesValor = "janeiro"; 
		}
		else if (mes == 2)
		{
			mesValor = "fevereiro";
		}
		else if (mes == 3)
		{
			mesValor = "marco";
		}
		else if (mes == 4)
		{
			mesValor = "abril";
		}
		else if (mes == 5)
		{
			mesValor = "maio";
		}
		else if (mes == 6)
		{
			mesValor = "junho";
		}
		else if (mes == 7)
		{
			mesValor = "julho";
		}
		else if (mes == 8)
		{
			mesValor = "agosto";
		}
		else if (mes == 9)
		{
			mesValor = "setembro";
		}
		else if (mes == 10)
		{
			mesValor = "outubro";
		}
		else if (mes == 11)
		{
			mesValor = "novembro";
		}
		else if (mes == 12)
		{
			mesValor = "dezembro";
		}
		
		return mesValor;
	}

	// Getter and Setters //
	public int getDia() 
	{
		return dia;
	}
	public void setDia(int dia) 
	{
		this.dia = validarDia(dia);
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) 
	{
		this.mes = validarMes(mes);
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) 
	{
		this.ano = validarAno(ano);
	}
}
