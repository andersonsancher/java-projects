package ficha6;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		double altura;
		
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura (m)? "));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Quantos kg tens? "));
		
		double imc = peso / (altura * altura);
		
		
		if (imc < 18.5) {
		    System.out.println("Abaixo do peso normal");
		} else if (imc < 25) {
		    System.out.println("Peso normal");
		} else if (imc < 30) {
		    System.out.println("Acima do peso normal");
		} else {
		    System.out.println("Obeso. Precisas perder algum peso");
		}
		
	}

}
