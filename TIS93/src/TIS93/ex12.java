package TIS93;

import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double euro, taxa, dolar;

		euro = Double.parseDouble(JOptionPane.showInputDialog("Escreva os euros:"));
		taxa = Double.parseDouble(JOptionPane.showInputDialog("Escreva a taxa de câmbio:"));

		dolar = euro * taxa;

		System.out.println("Valor do Euro: " + euro + "€" + " Convertido em dólares: " + String.format("%.2f", dolar) + "$");
	}

}
