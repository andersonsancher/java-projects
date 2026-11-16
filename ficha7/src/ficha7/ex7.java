package ficha7;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes;
		int opcao;
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de 1-12: "));
		
		switch (opcao) {
		case 1:
			mes = "Janeiro";
			break;

		case 2:
			mes = "Fevereiro";
			break;

		case 3:
			mes = "Março";
			break;

		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Maio";
			break;

		case 6:
			mes = "Junho";
			break;

		case 7:
			mes = "Julho";
			break;
		case 8:
			mes = "Agosto";
			break;

		case 9:
			mes = "Setembro";
			break;

		case 10:
			mes = "Outubro";
			break;
		case 11:
			mes = "Novembro";
			break;
		case 12:
			mes = "Dezembro";
			break;

		default:
			mes = "Mês inválido";
	}

	if (opcao < 1 || opcao > 12) {
		JOptionPane.showMessageDialog(null, "Mês inválido");
	} else {
		JOptionPane.showMessageDialog(null, "o mês correspondente é: " + mes);}
	}

}
