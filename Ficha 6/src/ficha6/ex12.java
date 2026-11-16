package ficha6;

import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int senha;
		int senha_valida=1234;
		
		senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
		
		if (senha == senha_valida) {System.out.println("ACESSO PERMITIDO");}
		
		else {System.out.println("ACESSO NEGADO");}
		
		
	}

}
