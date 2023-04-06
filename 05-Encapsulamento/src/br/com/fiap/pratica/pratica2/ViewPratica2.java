package br.com.fiap.pratica.pratica2;

import java.util.Scanner;

public class ViewPratica2 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o dia do mes: ");
		int userDia = scan.nextInt();
		
		System.out.println("Qual o mes do ano: ");
		int userMes = scan.nextInt();
		
		System.out.println("Qual o ano: ");
		int userAno = scan.nextInt();
		
		scan.close();
		
		
		Data data = new Data();
		data.setDia(userDia);
		data.setMes(userMes);
		data.setAno(userAno);
		
		String x = data.retornarData(data.getDia(), data.getMes(), data.getAno());
		System.out.println(x);
		
		String y = data.retornarMes(data.getMes());
		System.out.println(y);

	}
}