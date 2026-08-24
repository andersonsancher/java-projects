package ficha6;

import javax.swing.JOptionPane;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lado1;
		double lado2;
		double lado3;
		
		lado1 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do lado1: "));
		lado2 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do lado2: "));
		lado3 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do lado3: "));
		
		if (lado1 ==lado2 && lado2 == lado3) {
		    System.out.println("Triângulo Equilátero");
		}
		else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
		    System.out.println("Triângulo Isósceles");
		}
		else {
		    System.out.println("Triângulo Escaleno");
		}
		
	}

}
