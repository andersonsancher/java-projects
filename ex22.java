package ficha6;

import javax.swing.JOptionPane;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prato;
		int sobremesa;
		int bebida;
		int caloriasPrato;
		int totalCalorias;
		int caloriasSobremesa;
		int caloriasBebida;
		
		
		prato = Integer.parseInt(JOptionPane.showInputDialog(
			    "PRATO\n1 - Vegetariano\n2 - Peixe\n3 - Carne\n\nQual a sua escolha?"));
		

		
		
		if (prato == 1) {caloriasPrato= 180; //Vegetáriano
		}
		
		else if ( prato == 2) {caloriasPrato = 230;//Peixe
		}
		
		else  {caloriasPrato = 250;//Carne
		}	
		
				
		
		sobremesa = Integer.parseInt(JOptionPane.showInputDialog(
				"SOBREMESA\n1 - Fruta\n2 - Gelado\n3 - Mousse\n\nQual sua escolha de hoje?  "));
		
		if (sobremesa == 1) {caloriasSobremesa = 75; //Fruta
		}
		
		else if (sobremesa ==2) {caloriasSobremesa = 110; //Gelado 
		}
		
		else   {caloriasSobremesa = 200; //Mousse
		}
		
		
		bebida = Integer.parseInt(JOptionPane.showInputDialog(
				"BEBIDA\n1 - Chá\n2 - Sumo Laranja\n3 - Refrigerante\n Qual sua escolha de hoje?  "));
		
		if ( bebida ==1) {caloriasBebida = 20;//Chá
		}
		else if (bebida ==2) {caloriasBebida = 70;//Sumo Laranja
		}
		else  {caloriasBebida = 100;//Refrigerante
		}
		
		totalCalorias = caloriasPrato + caloriasSobremesa + caloriasBebida;

		JOptionPane.showMessageDialog(null, "O total de calorias da refeição é: " + totalCalorias + " cal");
		}
		
		}
		
	


