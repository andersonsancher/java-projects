package ficha7;

import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {

		int plano;
		double salarioAtual;
		double aumento;
		double novoSalario;

		plano = Integer.parseInt(JOptionPane.showInputDialog("Introduza o plano de trabalho (1, 2 ou 3): "));
		salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Introduza o salário atual: "));

		aumento = 0;

		switch (plano) {
			case 1:
				aumento = 0.10;
				break;

			case 2:
				aumento = 0.15;
				break;

			case 3:
				aumento = 0.20;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Plano inválido");
		}

		if (plano >= 1 && plano <= 3) {
			novoSalario = salarioAtual + (salarioAtual * aumento);
			JOptionPane.showMessageDialog(null, "O novo salário é: " + novoSalario + "€");
		}

	}
}