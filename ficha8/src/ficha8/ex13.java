package ficha8;

import javax.swing.JOptionPane;

public class ex13 {

    public static void main(String[] args) {

        int n, a, b, i;
        String resultado = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do divisor:"));

        a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a):"));

        b = Integer.parseInt(JOptionPane.showInputDialog("Final do intervalo (b):"));

        i = a;

        do {

            if (i % n == 0) {
                resultado = resultado + i + " ";
            }

            i++;

        } while (i <= b);

        JOptionPane.showMessageDialog(null,
                "Números divisíveis por " + n +
                " no intervalo de " + a + " a " + b + ":\n" +
                resultado);

    }

}