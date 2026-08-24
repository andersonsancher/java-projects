package ficha6;

import javax.swing.JOptionPane;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo;
		double credito;
		
		saldo = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do saldo médio no último ano: "));
		
		if (saldo <= 500) {
		    credito = 0; }
		else if (saldo >= 501 && saldo <=1000) {
			 credito = saldo * 0.30; }
		else if (saldo >= 1001 && saldo <=3000) {
			credito = saldo *  0.40; }
		else {credito = saldo * 0.50; }
		
		
		System.out.printf("O saldo médio é: %.2f€ | O valor do crédito é: %.2f€%n", saldo, credito);
	}

}
