package TIS93;

import javax.swing.JOptionPane;

public class exe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular a área de um triângulo (área= (base*altura)/2)
		
		double area;
		double base;
		double altura;
		
		base=Double.parseDouble(JOptionPane.showInputDialog("Escreva a Base: "));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Escreva a Altura: "));
		area = (base*altura)/2;
		System.out.println("a área total do Triângulo é: " + area );
		
	}

}
