package ficha8;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v,r,i;
		int opcao;
		
		do { 
				String menu = "Escolha o cálculo:\n\n"
	                + "1 - Calcular Voltagem\n"
	                + "2 - Calcular intesidade\n"
	                + "3 - Calcular Resistência\n"
	                + "0 - Sair";
		 
		 opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		 
		
		
		 
		 switch(opcao) {
		 case 1:
			 r = Double.parseDouble(JOptionPane.showInputDialog("Digite a resistência: "));
			 i = Double.parseDouble(JOptionPane.showInputDialog("Digite a Intesidade: "));
			 
			 v = i * r;
			 JOptionPane.showMessageDialog(null, "Voltagem = " + v);
			 
			 break;
		 
		 case 2: 
			 v = Double.parseDouble(JOptionPane.showInputDialog("Digite a Voltagem: "));
			 r = Double.parseDouble(JOptionPane.showInputDialog("Digite a resistência: "));
			 
			 i = v/r;
			 
			 JOptionPane.showMessageDialog(null, "Voltagem = " + i);
			 
			 break;
		  case 3:
			  v = Double.parseDouble(JOptionPane.showInputDialog("Digite a Voltagem: "));
			  i = Double.parseDouble(JOptionPane.showInputDialog("Digite a Intesidade: "));
			  
			  r = v/i;
			  
			  JOptionPane.showMessageDialog(null, "Voltagem = " + r);
			  
			  break;
		  case 0:
			  System.out.println("Programa terminado.");
			    break;
		 }	  
		} while (opcao != 0);
		 
	}

}
