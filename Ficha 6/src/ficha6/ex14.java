package ficha6;

import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lado;
		int numeroLados;
		double area;
		
		numeroLados = Integer.parseInt(JOptionPane.showInputDialog("Quantos lados tem ? "));
		lado = Double.parseDouble(JOptionPane.showInputDialog("Quantos cm tem cada lado: "));
		
		if (numeroLados == 3) {System.out.println("TRIÂNGULO");
		area = (Math.sqrt(3) * lado * lado) / 4;
	    System.out.println("Área = " + area);}
		
		else if (numeroLados == 4) {System.out.println("QUADRADO");
		area = lado * lado;
	    System.out.println("Área = " + area);}
		
		else if (numeroLados == 5) {System.out.println("PENTÁGONO");}
	}

}
