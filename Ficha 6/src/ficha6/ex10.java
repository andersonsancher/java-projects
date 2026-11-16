package ficha6;

import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean macacoA;
		boolean macacoB;
		
			macacoA = Boolean.parseBoolean(
			    JOptionPane.showInputDialog("O macaco A está a sorrir? (true/false)")
			);

			macacoB = Boolean.parseBoolean(
			    JOptionPane.showInputDialog("O macaco B está a sorrir? (true/false)")
			);
				
			
			if (macacoA && macacoB || !macacoA && !macacoB) {System.out.println("Temos problemas.");}
			
			else {
				System.out.println("Não temos problemas");
			}
	}

}
