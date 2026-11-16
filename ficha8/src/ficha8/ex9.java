package ficha8;

import javax.swing.JOptionPane;

public class ex9 {

    public static void main(String[] args) {

        int num, intervalo, fora, i;

        intervalo = 0;
        fora = 0;
        i = 1;

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Introduza o " + i + "º número:"));

            if (num >= 10 && num <= 20) {
                intervalo++;
            } else {
                fora++;
            }

            i++;

        } while (i <= 10);

        JOptionPane.showMessageDialog(null,
                "Números no intervalo [10,20]: " + intervalo +
                "\nNúmeros fora do intervalo: " + fora);

    }

}