package TIS93;

import javax.swing.JOptionPane;

public class exe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//Ler 3 notas e calcular a média.
		
		double n1=0, n2=0, n3=0, media=0;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("n1="));
		n2=Double.parseDouble(JOptionPane.showInputDialog("n2="));
		n3=Double.parseDouble(JOptionPane.showInputDialog("n3="));
		
		media=(n1+n2+n3)/3;
		
		System.out.println("media= " + media);
	}

}
