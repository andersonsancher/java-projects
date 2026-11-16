package ficha9;

import javax.swing.JOptionPane;

public class ex1_i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		boolean primo = true;
		
		
		num = Integer.parseInt(
                JOptionPane.showInputDialog("Escreva um número A: "));
		
		
		
			System.out.println("Será que o seu número:" + num + " é primo ?");
			
		
		for(int i=2;i < num;i++) {
			if (num % i==0) {
				primo = false;
			}
			
			}
	
		if (primo) {System.out.println("É primo");}
		
		else{
			System.out.println("Não é primo");
	}
	}
}
