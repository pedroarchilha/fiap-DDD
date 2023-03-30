package br.com.fiap.exercicio.media;

public class Aluno {

	
	String nome;
	
	String rm;
	
	double media;
	
	double cp1;
	
	double cp2; 
	
	double cp3;
 
	double challenge;
	 
	double global;
	
	double CalcularMediaCP() {
		double media;
		double menor;
	      if (cp1 <= cp2 && cp1 <= cp3) {
	          menor = cp1;
	       } else if (cp2 <= cp1 && cp2 <= cp3) {
	          menor = cp2;
	       } else {
	          menor = cp3;
	       }
	      
	      media = (cp1 + cp2 + cp3 - menor) / 2;
		
		return media;
	}
	
	
	double CalcularMedia(double cp, double challenge, double global) {
		double media;
	      
	      
	      media = ((cp * 0.2)+(challenge * 0.2)+(global * 0.6));
		
		return media;
	}
}
