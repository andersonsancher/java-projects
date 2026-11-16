package TIS93;

import javax.swing.JOptionPane;

public class exe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0;
		int n2=0;
		
		int r=0;
		double r1=0;
		
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Escreva um número que represente o n1: "));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Escreva um número que represente o n2: "));
		
		
		r=n1+n2;	
		System.out.println("Resultado=" + r);
		
		r=n1-n2;		
		System.out.println("Resultado=" + r);
		
		r=n1*n2;
		System.out.println("Resultado=" + r);
		
		r1=(double)n1/(double)n2;
		System.out.println("Resultado=" + r);
		
		r=n1%n2;
		System.out.println("Resultado=" + r);
	}

}
