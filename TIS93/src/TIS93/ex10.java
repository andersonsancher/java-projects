package TIS93;

import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double preco=0;
			double desconto=0;
			double preco_final=0;
			
			preco=Double.parseDouble(JOptionPane.showInputDialog("Escreva Preço do Produto:  " ));
			desconto=Double.parseDouble(JOptionPane.showInputDialog("Escreva quantos % de desconto o cliente terá:  " ));
			
			double valorDesconto = preco * desconto;
			
			preco_final= preco - valorDesconto;
			
			System.out.println("Você teve desconto de: " + (desconto * 100) + "%");
			
			System.out.println("o preço final do produto é: " + preco_final + "$");
	}

}
