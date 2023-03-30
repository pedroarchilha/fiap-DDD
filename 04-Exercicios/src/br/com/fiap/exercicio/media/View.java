 package br.com.fiap.exercicio.media;
 import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		aluno.nome = leitor.next(); 
		
		System.out.println("Digite a nota do checkpoint 1");
		aluno.cp1 = leitor.nextFloat();
		
		System.out.println("Digite a nota do checkpoint 2");
		aluno.cp2 = leitor.nextFloat();
		
		System.out.println("Digite a nota do checkpoint 3");
		aluno.cp3 = leitor.nextFloat();
		
		System.out.println("Digite a nota do challenge");
		aluno.challenge = leitor.nextFloat();
		
		System.out.println("Digite a nota da global");
		aluno.global = leitor.nextFloat();
		
		leitor.close();

		
		aluno.media = aluno.CalcularMedia(aluno.CalcularMediaCP(), aluno.challenge, aluno.global);
		
		System.out.println(aluno.nome + " sua média é: " + aluno.media);
	}

}
