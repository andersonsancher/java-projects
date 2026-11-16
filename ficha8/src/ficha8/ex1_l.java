package ficha8;

import javax.swing.JOptionPane;

public class ex1_l {

    public static void main(String[] args) {

        int n;
        int soma = 0;

        do {

            n = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um número (0 para terminar):")
            );

            soma += n;

        } while (n != 0);


        JOptionPane.showMessageDialog(null, "Soma total = " + soma);

    }
}