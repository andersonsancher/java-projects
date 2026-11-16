package ficha8;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,opcao,resultado;
		String menu;
		
		
		do { 
			
			menu = "Escolha o cálculo:\n\n"
                + "1 - Somar\n"
                + "2 - Diminuir\n"
                + "3 - Multiplicar\n"
                + "4 - Dividir\n"
                + "5 - Resto da Divisão\n"
                + "0 - Sair";
	 
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch(opcao) {
			
			case 1:
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
				
				resultado = num1 + num2;
				
				System.out.println("A soma é: " + resultado);
			
			break;
			
			case 2: 
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
				
				resultado = num1 - num2;
				
				System.out.println("A subtração é: " + resultado);
		
			break;
			
			case 3:
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
				
				resultado = num1 * num2;
				
				System.out.println("A soma é: " + resultado);
				
			break;
			
			case 4:
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
				
				resultado = num1/num2;
				
				System.out.println("A soma é: " + resultado);
			break;
			case 5:
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
				
				resultado = num1 % num2;
				
				System.out.println("O Resto da divisão é: " + resultado);
			}
		} while (opcao != 0);
	}

}
