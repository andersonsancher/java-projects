package TIS93;

import javax.swing.JOptionPane;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
						
				double v;
				double r;
				double i;
				
			
				
				r=Double.parseDouble(JOptionPane.showInputDialog("Escreva um número que represente os ohms: "));
				i=Double.parseDouble(JOptionPane.showInputDialog("Escreva um número que represente o Amperes: "));
				
				v=r*i;
				
				
				System.out.println("os Volts é: " + v );
				
			}

		}

