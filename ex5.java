package ficha6;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A;
		int B;
		
		
		A = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número A: "));
		B = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número B: "));
		
		if (A % B ==0)
		System.out.println("O Número A é multiplo do Número B " );
		
		if (B % A ==0)
		System.out.println("O Número B é multiplo do Número A ");
		
		else 
		{System.out.println("Não é multiplo um do outro");}
	}

}
