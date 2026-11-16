package TIS93;

import javax.swing.JOptionPane;

public class exe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ler uma temperatura em graus Fahrenheit e converter para graus Celcius (C= (F-32) * (5/9))
		
		
		double c=0;
		double f=0;
		
		
		f=Double.parseDouble(JOptionPane.showInputDialog("Escreva quantos graus Fahrenheit está: " ));

		c=(f-32)*((double)5/(double)9);
		
		
		System.out.println("Convertido para Celcius: " + c + " C");
	}

}

