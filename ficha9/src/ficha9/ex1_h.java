package ficha9;

import javax.swing.JOptionPane;

public class ex1_h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soma=0;
		int numA=0;
		int numB=0;
		
		
		numA = Integer.parseInt(
                JOptionPane.showInputDialog("Escreva um número A: "));
		
		numB = Integer.parseInt(
                JOptionPane.showInputDialog("Escreva um número B: "));
		
			System.out.println("A = " + numA);
			System.out.println("B = " + numB);
		
		for(int i=numA;i<=numB;i++) {
			soma += i;
			} 
		System.out.println(soma);
	}
	}
