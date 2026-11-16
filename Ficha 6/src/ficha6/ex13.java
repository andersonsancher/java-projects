package ficha6;

import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double total;
		int quantidade;
		
		
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs vai querer? "));
		
		
		
		if (quantidade < 12) {total = quantidade * 0.30; System.out.println("o Total da compra é: " + total + "€");}
		
		else {total = quantidade * 0.25; System.out.println("o Total da compra é: " + total + "€");}
	}

}
