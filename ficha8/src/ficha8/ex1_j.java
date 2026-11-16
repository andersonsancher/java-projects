package ficha8;

import javax.swing.JOptionPane;

public class ex1_j {

    public static void main(String[] args) {

        int n;

        do {

            n = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um número maior que zero:")
            );

        } while (n <= 0);


        JOptionPane.showMessageDialog(null, "Número válido: " + n);

    }
}