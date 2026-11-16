package ficha6;

import javax.swing.JOptionPane;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int B;
		
		A = Integer.parseInt(JOptionPane.showInputDialog("Digite num1:  "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Digite num2:  "));
		
		if (A == B ) {System.out.println("a Soma é: "+ (A + B));}
		
		else {System.out.println("o Resultado é: "+ (A * B));}
		
	}

}
