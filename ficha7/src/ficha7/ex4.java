package ficha7;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {

		int opcao;
		double volume=0;
		double s=0, l=0, w=0, h=0, r=0;
		double pi = 3.14159;

		String menu = "Escolha o sólido para calcular o volume:\n"
				+ "1 - Cubo\n"
				+ "2 - Prisma retangular\n"
				+ "3 - Esfera\n"
				+ "4 - Cilindro\n"
				+ "5 - Cone\n"
				+ "6 - Pirâmide";

		opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));



		switch (opcao) {
			case 1:
				s = Double.parseDouble(JOptionPane.showInputDialog("Introduza o lado (s): "));
				volume = s * s * s;
				break;

			case 2:
				l = Double.parseDouble(JOptionPane.showInputDialog("Introduza o comprimento (l): "));
				w = Double.parseDouble(JOptionPane.showInputDialog("Introduza a largura (w): "));
				h = Double.parseDouble(JOptionPane.showInputDialog("Introduza a altura (h): "));
				volume = l * w * h;
				break;

			case 3:
				r = Double.parseDouble(JOptionPane.showInputDialog("Introduza o raio (r): "));
				volume = (4.0 / 3.0) * pi * r * r * r;
				break;

			case 4:
				r = Double.parseDouble(JOptionPane.showInputDialog("Introduza o raio (r): "));
				h = Double.parseDouble(JOptionPane.showInputDialog("Introduza a altura (h): "));
				volume = pi * r * r * h;
				break;

			case 5:
				r = Double.parseDouble(JOptionPane.showInputDialog("Introduza o raio (r): "));
				h = Double.parseDouble(JOptionPane.showInputDialog("Introduza a altura (h): "));
				volume = (1.0 / 3.0) * pi * r * r * h;
				break;

			case 6:
				s = Double.parseDouble(JOptionPane.showInputDialog("Introduza o lado da base (s): "));
				h = Double.parseDouble(JOptionPane.showInputDialog("Introduza a altura (h): "));
				volume = (1.0 / 3.0) * s * s * h;
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
		}

		if (opcao >= 1 && opcao <= 6) {
			JOptionPane.showMessageDialog(null, "O volume calculado é: " + volume);
		}

	}
}
