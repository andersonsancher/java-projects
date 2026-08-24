package ficha6;

import javax.swing.JOptionPane;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco;
		int opcao; // de pagamento
	
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Qual valor do produto? "));
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual formato de pagamento?  "));
		
		if (opcao == 1) {System.out.println("Em dinheiro, recebe 10% de desconto: " + (preco - (preco * 0.10) + "€"))
			;}
		else if (opcao == 2) {System.out.println("Com cartão de crédito, recebe 15% de desconto: " + (preco - (preco * 0.15) + "€"))
			;}
		else if (opcao == 3) {System.out.println("Em duas vezes, preço normal de etiqueta sem descontos: " + (preco ) + "€")
			;}
		else if (opcao == 4) {System.out.println("Em três vezes, preço normal de etiqueta mais juros de 10%: " + (preco +(preco * 0.10) + "€"))
			;}
		
		else {System.out.println("Opção inválida.");}
	}

}
