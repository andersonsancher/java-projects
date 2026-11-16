package TIS93;

import javax.swing.JOptionPane;

public class exe5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ler uma temperatura em graus Fahrenheit e converter para graus Celcius (C= (F-32) * (5/9))
		
		
		double c=0;
		double f=0;
		
		
		c=Integer.parseInt(JOptionPane.showInputDialog("Escreva quantos graus centigrados está: " ));

		f=c*((double)9/(double)5) +32;
		
		
		System.out.println("Convertido para Fahrenheit: " + f);
	}

}
