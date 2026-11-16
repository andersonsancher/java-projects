package ficha7;

import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {

		double preco;
		int codigo;
		int prestacoes;
		double desconto;
		double precoComDesconto;
		double valorPrestacao;

		String menu = "Forma de pagamento:\n\n"
				+ "1 - 1 vez        (30% desconto)\n"
				+ "2 - Em 2 vezes    (20% desconto)\n"
				+ "3 - Em 3 vezes    (10% desconto)\n"
				+ "4 - De 4 a 6 vezes (sem desconto)";

		JOptionPane.showMessageDialog(null, menu);

		preco = Double.parseDouble(JOptionPane.showInputDialog("Introduza o preço do produto: "));
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduza o código da forma de pagamento: "));

		desconto = 0;
		prestacoes = 1;

		switch (codigo) {
			case 1:
				desconto = 0.30;
				prestacoes = 1;
				break;

			case 2:
				desconto = 0.20;
				prestacoes = 2;
				break;

			case 3:
				desconto = 0.10;
				prestacoes = 3;
				break;

			case 4:
				desconto = 0;
				prestacoes = Integer.parseInt(JOptionPane.showInputDialog("Quantas prestações (4, 5 ou 6)? "));
				break;

			default:
				JOptionPane.showMessageDialog(null, "Código inválido");
		}

		if (codigo >= 1 && codigo <= 4) {
			precoComDesconto = preco - (preco * desconto);
			valorPrestacao = precoComDesconto / prestacoes;

			JOptionPane.showMessageDialog(null,
					"Número de prestações: " + prestacoes + "\n"
					+ "Valor de cada prestação: " + valorPrestacao + "€");
		}

	}
}