package ficha7;

import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {

		double precoCusto;
		int codigo;
		double margem;
		double precoVenda;
		String categoria;

		String menu = "Categorias:\n\n"
				+ "1 - Horticultura (80%)\n"
				+ "2 - Lacticínios   (80%)\n"
				+ "3 - Carnes        (100%)\n"
				+ "4 - Peixes        (100%)\n"
				+ "5 - Aves          (90%)\n"
				+ "6 - Ovos          (90%)";

		JOptionPane.showMessageDialog(null, menu);

		precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Introduza o preço de custo do produto: "));
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduza o código da categoria: "));

		margem = 0;
		categoria = "";

		switch (codigo) {
			case 1:
				categoria = "Horticultura";
				margem = 0.80;
				break;

			case 2:
				categoria = "Lacticínios";
				margem = 0.80;
				break;

			case 3:
				categoria = "Carnes";
				margem = 1.00;
				break;

			case 4:
				categoria = "Peixes";
				margem = 1.00;
				break;

			case 5:
				categoria = "Aves";
				margem = 0.90;
				break;

			case 6:
				categoria = "Ovos";
				margem = 0.90;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Código inválido");
		}

		if (codigo >= 1 && codigo <= 6) {
			precoVenda = precoCusto + (precoCusto * margem);
			JOptionPane.showMessageDialog(null,
					"Categoria: " + categoria + "\n"
					+ "Preço de venda: " + precoVenda + "€");
		}

	}
}