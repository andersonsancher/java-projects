package ficha6;

import javax.swing.JOptionPane;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double minutos;
		int horas;
		double preco = 0;
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("horas de permanência no parque: "));
		minutos	= Double.parseDouble(JOptionPane.showInputDialog("minutos de permanência no parque: "));
		
		minutos = minutos / 60;
		
		if (horas == 0 ) {preco = 2;}
		
		else if (horas == 1) {preco = 2 + (minutos * 1.5);}
		
		else	{preco = 2 + 1.5 + (horas - 2) + minutos;}
			
			
			System.out.println("O valor a pagar é: " + preco + " €");
		
		
	}

}
