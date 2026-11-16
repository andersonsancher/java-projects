package TIS93;

import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double altura;
		double raio;
		
		
		raio=Double.parseDouble(JOptionPane.showInputDialog("Escreva o raio da Base: "));
		altura=Double.parseDouble(JOptionPane.showInputDialog("Escreva a Altura: "));
		double volume = (Math.PI * (raio * raio)) * altura;
		System.out.println("o volume do cilindro é: " + volume );
		
	}

}
