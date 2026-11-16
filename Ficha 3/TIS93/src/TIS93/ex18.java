package TIS93;

import javax.swing.JOptionPane;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso;
		double altura;
		double imc;
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?  "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?  "));
		
		imc = peso / (altura*altura);
		
		System.out.println("o seu índice de massa corporal (IMC) é:  " + imc);
	}

}
