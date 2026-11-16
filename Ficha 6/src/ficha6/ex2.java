package ficha6;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota número 1: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota número 2: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota número 3: "));
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media <7.5) {System.out.println("Reprovado");}
		
		else if (media >7.5 && media <=9.5) {System.out.println("Admitido");}
		
		else {System.out.println("Dispensado");}
	}

}
