package ficha9;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int resultado=1;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: "));
		

		if (num < 0) {
            System.out.println("O fatorial não existe para números negativos.");
        } else {
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
            System.out.println("O fatorial de " + num + " é " + resultado);}
	} 

}
