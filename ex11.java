package ficha6;

import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas;
		boolean papagaio;
		
		
		horas = Integer.parseInt(JOptionPane.showInputDialog("Que horas são: "));
		papagaio = Boolean.parseBoolean(JOptionPane.showInputDialog("O papaguaio  está a falar? (true/false)"));
		
		if (papagaio = horas <7 || horas >20) {System.out.println("Temos um problema.");}
		else {System.out.println("Estamos bem, sem problemas");};
		
	}

}
