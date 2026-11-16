package ficha7;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {

		int opcao;
		double euros;
		double resultado=0;
		String moeda="";

		euros = Double.parseDouble(JOptionPane.showInputDialog("Introduza a quantidade em Euros: "));

		String menu = "Converter para:\n"
				+ "1 - Dólares (USA)\n"
				+ "2 - Libras (UK)\n"
				+ "3 - Yuan (China)\n"
				+ "4 - Franco Suíço";

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

		

		switch (opcao) {
			case 1:
				resultado = euros * 1.14;
				moeda = "Dólares";
				break;

			case 2:
				resultado = euros * 0.85;
				moeda = "Libras";
				break;

			case 3:
				resultado = euros * 8.27;
				moeda = "Yuan";
				break;

			case 4:
				resultado = euros * 0.93;
				moeda = "Francos Suíços";
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
		}

		if (opcao >= 1 && opcao <= 4) {
			JOptionPane.showMessageDialog(null, euros + " Euros equivalem a " + resultado + " " + moeda);
		}

	}
}
