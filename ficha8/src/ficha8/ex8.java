package ficha8;

import javax.swing.JOptionPane;

public class ex8 {

    public static void main(String[] args) {

        int num, pares, impares, i;

        pares = 0;
        impares = 0;
        i = 1;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Introduza o " + i + "º número:"));

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            i++;

        } while (i <= 10);

        JOptionPane.showMessageDialog(null,
                "Quantidade de números pares: " + pares +
                "\nQuantidade de números ímpares: " + impares);

    }

}