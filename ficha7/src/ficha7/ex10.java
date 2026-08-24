package ficha7;

import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {

		int numero=0;
		int idioma=0;
		String extenso="";

		numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número entre 0 e 10: "));

		String menuIdioma = "Escolha o idioma:\n"
				+ "1 - Português\n"
				+ "2 - Inglês\n"
				+ "3 - Espanhol\n";
				 

		idioma = Integer.parseInt(JOptionPane.showInputDialog(menuIdioma));

		

		if (numero < 0 || numero > 10) {

			JOptionPane.showMessageDialog(null, "Número inválido");

		} else {

			switch (idioma) {

				case 1: 
					switch (numero) {
						case 0: extenso = "Zero"; break;
						case 1: extenso = "Um"; break;
						case 2: extenso = "Dois"; break;
						case 3: extenso = "Três"; break;
						case 4: extenso = "Quatro"; break;
						case 5: extenso = "Cinco"; break;
						case 6: extenso = "Seis"; break;
						case 7: extenso = "Sete"; break;
						case 8: extenso = "Oito"; break;
						case 9: extenso = "Nove"; break;
						case 10: extenso = "Dez"; break;
					}
					break;

				case 2:
					switch (numero) {
						case 0: extenso = "Zero"; break;
						case 1: extenso = "One"; break;
						case 2: extenso = "Two"; break;
						case 3: extenso = "Three"; break;
						case 4: extenso = "Four"; break;
						case 5: extenso = "Five"; break;
						case 6: extenso = "Six"; break;
						case 7: extenso = "Seven"; break;
						case 8: extenso = "Eight"; break;
						case 9: extenso = "Nine"; break;
						case 10: extenso = "Ten"; break;
					}
					break;


				case 3: 
					switch (numero) {
						case 0: extenso = "Cero"; break;
						case 1: extenso = "Uno"; break;
						case 2: extenso = "Dos"; break;
						case 3: extenso = "Tres"; break;
						case 4: extenso = "Cuatro"; break;
						case 5: extenso = "Cinco"; break;
						case 6: extenso = "Seis"; break;
						case 7: extenso = "Siete"; break;
						case 8: extenso = "Ocho"; break;
						case 9: extenso = "Nueve"; break;
						case 10: extenso = "Diez"; break;
					}
					break;

				default:
					JOptionPane.showMessageDialog(null, "Idioma inválido");

			}

			if (idioma >= 1 && idioma <= 4) {
				JOptionPane.showMessageDialog(null, "Número por extenso: " + extenso);
			}

		}

	}
}