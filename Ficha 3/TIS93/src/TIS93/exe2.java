package TIS93;

import javax.swing.JOptionPane;

public class exe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcular a área de um retângulo (área=lado1*lado2)
		
		int lado1;
		int lado2;
		int area;
		
	
		
		lado1=Integer.parseInt(JOptionPane.showInputDialog("Escreva um número que represente o lado1: "));
		lado2=Integer.parseInt(JOptionPane.showInputDialog("Escreva um número que represente o lado2: "));
		
		area = lado1*lado2;
		System.out.println("a área total do retângulo é: " + area );
	}

}
