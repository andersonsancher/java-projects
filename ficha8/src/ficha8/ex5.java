package ficha8;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double retangulo,triangulo,circunferencia,base,altura,raio;
		int opcao;
		final double PI=3.14;
		
		do { 
				String menu = "Escolha o cálculo:\n\n"
	                + "1 - Área retângulo\n"
	                + "2 - Área triangulo\n"
	                + "3 - Área circunferência\n"
	                + "0 - Sair";
		 
		 opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
		 
		 
		 switch(opcao) {
		 case 1:
			 base = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor da base: "));
			 altura = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor da altura: "));
			 
			 retangulo = base * altura;
			 JOptionPane.showMessageDialog(null, "A área total do retangulo é:  " + retangulo );
			 
			 break;
		 
		 case 2: 
			 base = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor da base: "));
			 altura = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor da altura: "));
			 
			 triangulo = (base * altura)/2;
			 JOptionPane.showMessageDialog(null, "A área total do Triângulo é:  " + triangulo );
			 
			 break;
		  case 3:
			  
			  raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor do raio: "));
				 
					circunferencia = PI * raio * raio;
				 JOptionPane.showMessageDialog(null, "A área da Circunferência é:  " + circunferencia );
			  
			  
			  break;
		  case 0:
			  System.out.println("Programa terminado.");
			    break;
		  default:
			    JOptionPane.showMessageDialog(null, "Opção inválida!");
			    break;
		 }	  
		} while (opcao != 0);
		 
	}

}
