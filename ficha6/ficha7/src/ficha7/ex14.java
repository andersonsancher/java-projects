package ficha7;

import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		
		int diaDoMes;
		mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de 1-12: "));
		
		switch (mes) {
		case 1:
			
			diaDoMes = 31;
			break;

		case 2:
			
			diaDoMes = 28;
			break;

		case 3:
			
			diaDoMes = 31;
			break;

		case 4:
			
			diaDoMes = 30;
			break;
		case 5:
			
			diaDoMes = 31;
			break;

		case 6:
			
			diaDoMes = 30;
			break;

		case 7:
			
			diaDoMes = 31;
			break;
		case 8:
			
			diaDoMes = 31;
			break;

		case 9:
			
			diaDoMes = 30;
			break;

		case 10:
			
			diaDoMes = 31;
			break;
		case 11:
			
			diaDoMes = 30;
			break;
		case 12:
			
			diaDoMes = 31;
			break;

		default:
			diaDoMes = -1;
	}

	if (diaDoMes != -1) {
		JOptionPane.showMessageDialog(null, "o Mês "+ mes + " tem " + diaDoMes + " dias" );
	} else {
		JOptionPane.showMessageDialog(null,  "Mês Inválido. "  );}
	}
}
