package ficha6;

import javax.swing.JOptionPane;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diaDaSemana;
		
		diaDaSemana = Integer.parseInt(JOptionPane.showInputDialog("Digite de 1 a 7:  para eu lhe dizer qual dia da semana é. "));
		
		if (diaDaSemana == 1) {System.out.println("dia 1 corresponde ao Domingo. ");}
		
		else if (diaDaSemana == 2) {System.out.println("dia 2 corresponde a Segunda-Feira. ");}
		
		else if (diaDaSemana == 3) {System.out.println("dia 3 corresponde a Terça-Feira. ");}
		
		else if (diaDaSemana == 4) {System.out.println("dia 4 corresponde a Quarta-Feira. ");}
		
		else if (diaDaSemana == 5) {System.out.println("dia 5 corresponde a Quinta-Feira. ");}
		
		else if (diaDaSemana == 6) {System.out.println("dia 6 corresponde a Sexta-Feira. ");}
		
		else {System.out.println("dia 7 corresponde a Sabádo. ");}
	}

}
