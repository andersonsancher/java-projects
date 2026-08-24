package ficha6;

import javax.swing.JOptionPane;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean divisivel=false;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:  "));
		
		
		if (numero % 10 == 0) {System.out.println("Divisível por 10");
		divisivel = true;}
		
		if (numero % 5 == 0) {System.out.println("Divisível por 05");
		divisivel = true;}
		
		if (numero % 2 == 0) {System.out.println("Divisível por 02");
		divisivel = true;}
		
		if (!divisivel ) {System.out.println("Não é divisível por nenhum deles.");}
	}

}
