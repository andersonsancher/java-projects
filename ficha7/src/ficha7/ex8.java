package ficha7;

import javax.swing.JOptionPane;

public class ex8 {

	public static void main(String[] args) {

		int codigo;
		String classificacao;

		String menu = "Tabela de códigos de produtos:\n\n"
				+ "1        - Alimento não-perecível\n"
				+ "2, 3 ou 4 - Alimento perecível\n"
				+ "5 ou 6    - Vestuário\n"
				+ "7        - Higiene Pessoal\n"
				+ "8 até 15  - Limpeza e Utensílios Domésticos";

		JOptionPane.showMessageDialog(null, menu);

		codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduza o código do produto: "));

		switch (codigo) {
			case 1:
				classificacao = "Alimento não-perecível";
				break;

			case 2:
			case 3:
			case 4:
				classificacao = "Alimento perecível";
				break;

			case 5:
			case 6:
				classificacao = "Vestuário";
				break;

			case 7:
				classificacao = "Higiene Pessoal";
				break;

			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				classificacao = "Limpeza e Utensílios Domésticos";
				break;

			default:
				classificacao = "Código inválido";
		}

		JOptionPane.showMessageDialog(null, "Classificação: " + classificacao);

	}
}