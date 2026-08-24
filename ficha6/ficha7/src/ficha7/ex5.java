package ficha7;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {

		double a, b, c, d, e, f;
		double x, y;
		double denominador;

		a = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor de a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor de b: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor de c: "));
		d = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor de d: "));
		e = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor de e: "));
		f = Double.parseDouble(JOptionPane.showInputDialog("Introduza o valor de f: "));

		denominador = a * e - b * d;

		if (denominador == 0) {
			JOptionPane.showMessageDialog(null, "O sistema não pode ser resolvido (ae - bd = 0)");
		} else {
			x = (c * e - b * f) / denominador;
			y = (a * f - c * d) / denominador;

			JOptionPane.showMessageDialog(null, "x = " + x + "\ny = " + y);
		}

	}
}