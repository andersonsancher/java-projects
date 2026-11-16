package ficha8;

import javax.swing.JOptionPane;

public class ex1_h {

    public static void main(String[] args) {

        int a, b;
        int soma = 0;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));

        do {

            soma += a;
            a++;

        } while (a <= b);

        JOptionPane.showMessageDialog(null, "Soma = " + soma);

    }
}