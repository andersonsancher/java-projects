package ficha7;

import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {

		int codigo;
		int quantidade;
		double precoUnitario=0;
		double total;
		String produto="";

		String menu = "Cardápio:\n\n"
				+ "100 - Cachorro quente (1,70€)\n"
				+ "101 - Bifana Simples (2,30€)\n"
				+ "102 - Bifana com ovo (2,60€)\n"
				+ "103 - Hambúrguer (2,40€)\n"
				+ "104 - Cheeseburger (2,50€)\n"
				+ "105 - Sumo (1,00€)";

		JOptionPane.showMessageDialog(null, menu);

		codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduza o código do produto: "));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Introduza a quantidade: "));
		

		switch (codigo) {
			case 100:
				produto = "Cachorro quente";
				precoUnitario = 1.70;
				break;

			case 101:
				produto = "Bifana Simples";
				precoUnitario = 2.30;
				break;

			case 102:
				produto = "Bifana com ovo";
				precoUnitario = 2.60;
				break;

			case 103:
				produto = "Hambúrguer";
				precoUnitario = 2.40;
				break;

			case 104:
				produto = "Cheeseburger";
				precoUnitario = 2.50;
				break;

			case 105:
				produto = "Sumo";
				precoUnitario = 1.00;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Código inválido");
		}

		if (codigo >= 100 && codigo <= 105) {
			total = precoUnitario * quantidade;
			JOptionPane.showMessageDialog(null, quantidade + "x " + produto + " = " + total + "€");
		}

	}
}