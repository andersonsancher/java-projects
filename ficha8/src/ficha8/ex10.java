package ficha8;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String[] args) {

        int num, soma=0, i=1;
        double media;

        

        do {

            num = Integer.parseInt(JOptionPane.showInputDialog("Introduza o " + i + "º número:"));

            soma = soma + num;

            i++;

        } while (i <= 3);

        media = (double) soma / 3;

        JOptionPane.showMessageDialog(null, "A média é: " + media);

    }

}