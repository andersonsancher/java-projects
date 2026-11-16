package ficha6;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int maior;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva outro número: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o último número: "));
		
		maior=num1;
		
		if(num2>maior)maior=num2;
		if(num3>maior)maior=num3;
		
		System.out.println("o maior número é: " + maior);
	}

}
