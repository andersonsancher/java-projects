package TIS93;

import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double areaSala;
		double janela1, janela2, porta;
		double areaPintar;
		double tintaNecessaria;
		
		
		areaSala = Double.parseDouble(JOptionPane.showInputDialog(" Área total da sala (m²): "));
		
		janela1 = Double.parseDouble(JOptionPane.showInputDialog( "Área total da janela1 (m²): "));
		janela2 = Double.parseDouble(JOptionPane.showInputDialog( "Área total da janela2 (m²): "));
		porta = Double.parseDouble(JOptionPane.showInputDialog( "Área total da porta (m²): "));
		
		areaPintar = areaSala - (janela1 + janela2 + porta);
		tintaNecessaria = areaPintar / 20;
		
		System.out.println("Área a pintar: " + areaPintar + "m²");
		System.out.println("Tinta necessária: " + tintaNecessaria + " litros");
	}

}

