package ficha8;

import javax.swing.JOptionPane;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA,numB, temp, i,j;
		boolean primo;
		String resultado = "";
		
		numA = Integer.parseInt(JOptionPane.showInputDialog("Introduza o valor de a: "));
        numB = Integer.parseInt(JOptionPane.showInputDialog("Introduza o valor de b: "));

        if (numA > numB) {
            temp = numA;
            numA = numB;
            numB = temp;
        }

        i = numA;

        do {
            primo = true;

            if (i < 2) {
                primo = false;
            } else {
                j = 2;

                do {
                    if (i % j == 0) {
                        primo = false;
                    }
                    j++;
                } while (j < i && primo);
            }

            if (primo) {
                resultado = resultado + i + " ";
            }

            i++;
        } while (i <= numB);
        JOptionPane.showMessageDialog(null, "Números primos: " + resultado);
		
	}

}
