package ficha9;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int num;

		nome = JOptionPane.showInputDialog("Escreva um nome: ");
		num = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: "));
		

		for (int i = 1; i <= num; i++) {
            System.out.println(nome);}
	}

}
