package ficha6;

import javax.swing.JOptionPane;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double angulo1;
		double angulo2;
		double angulo3;
		
		angulo1 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do angulo1: "));
		angulo2 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do angulo2: "));
		angulo3 = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do angulo3: "));
		
		if (angulo1 + angulo2 + angulo3 != 180) {
		    System.out.println("Não é um triângulo válido");
		}
		else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
		    System.out.println("Triângulo Retângulo");
		}
		else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
		    System.out.println("Triângulo Obtusângulo");
		}
		else {
		    System.out.println("Triângulo Acutângulo");
		}
		}
	}


