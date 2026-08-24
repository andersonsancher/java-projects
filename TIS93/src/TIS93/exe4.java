package TIS93;

import javax.swing.JOptionPane;

public class exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcular a área de um círculo (área=pi*raio*raio,pi=3.14)
		
		double  area;
		double pi=3.14;
		double raio;
		

		raio=Double.parseDouble(JOptionPane.showInputDialog("Escreva o Raio: "));
		area = pi*raio*raio;
		System.out.println("a área total do Círculo é: " + area );
	}

}
