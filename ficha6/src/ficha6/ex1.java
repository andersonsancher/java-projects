package ficha6;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=0;
		int nadador=0;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite qual sua idade:"));
		
		
		
		if(idade<= 6) {
			System.out.println("Golfinho: até aos 6 anos; ");
		}
		
		else if  (idade<11 && idade >=7) {
			System.out.println("Infatil: 7-10 anos;");
					}
		else if (idade>= 11 && idade <=13 ) {
			System.out.println("Juvenil: 11-13 anos;");	
		}
		else if (idade>= 14 && idade <=17 ) {
			System.out.println("Tubarão: 14-17 anos;");	
		}
		else if  (idade>= 18 && idade <=130) {
			System.out.println("Cota: maiores de 18 anos.");	
		}	
		else {
			System.out.println("impossível um ser humano viver esses anos todos.");
		}
		
	}

}
