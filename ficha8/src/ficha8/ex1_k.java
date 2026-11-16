package ficha8;

import javax.swing.JOptionPane;

public class ex1_k {

    public static void main(String[] args) {

        int n;

        do {

            n = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um número entre 15 e 20:")
            );

        } while (n < 15 || n > 20);


        JOptionPane.showMessageDialog(null, "Número aceite: " + n);

    }
}