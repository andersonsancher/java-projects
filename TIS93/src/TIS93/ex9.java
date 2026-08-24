package TIS93;

import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double so = 0;
		double vo=0;
		double a=0;
		double t=0;
		double s=0;
		
		so=Double.parseDouble(JOptionPane.showInputDialog("Escreva deslocamento inicial:  " ));
		vo=Double.parseDouble(JOptionPane.showInputDialog("Escreva velocidade inicial:  " ));
		a=Double.parseDouble(JOptionPane.showInputDialog("Escreva aceleração:  " ));
		t=Double.parseDouble(JOptionPane.showInputDialog("Escreva tempo decorrido:  " ));
		
		s= so + vo * t + (1.0/2.0) * a * t *t;
	    System.out.println("Deslocamento final é: " + s);
	}

}
