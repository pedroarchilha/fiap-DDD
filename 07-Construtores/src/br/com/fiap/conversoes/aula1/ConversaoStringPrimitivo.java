package br.com.fiap.conversoes.aula1;

import javax.swing.JOptionPane;

public class ConversaoStringPrimitivo {

	public static void main(String[] args) {

		// Definir uma variavel do tipo String

		String idade = "10"; // Classe criada ja com atributo estabelecido. 
							//	Todos os objetos instanciados terao String 10 como idade

		// Transformar a String em um tipo primitivo
		// byte, short, int, long, float, double

		byte idadeByte = Byte.parseByte(idade);
		short idadeShort = Short.parseShort(idade);
//		 int idadeInt = Integer.parseInt(idade); comentado para evitar duplicidade
		long idadeLong = Long.parseLong(idade);
		float idadeFloat = Float.parseFloat(idade);
		double idadeDouble = Double.parseDouble(idade);

		// Ler um numero
		idade = JOptionPane.showInputDialog("Digite a ida1de: ");
		int idadeInt = Integer.parseInt(idade);

		if (idadeInt < 0) {
			JOptionPane.showMessageDialog(null, "Idade Invalida");
		}

		else if (idadeInt < 18) {
			// Exiba quanto falta para atingir 18 anos
			JOptionPane.showMessageDialog(null, "Faltam " + (18 - idadeInt) + " para chegar aos 18 anos.");
		}

		else {
			JOptionPane.showMessageDialog(null, "Voce ja passou dos 18, jovem.");
		}

	}
}
