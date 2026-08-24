package ficha9;

import javax.swing.JOptionPane;

public class ex10 {

    public static void main(String[] args) {

        int n, a, b;
        String resultado = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do divisor: "));
        a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a): "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Final do intervalo (b): "));

        for (int i = a; i <= b; i++) {

            if (i % n == 0) {
                resultado += i + " ";
            }
        }

        JOptionPane.showMessageDialog(null,
                "Números divisíveis por " + n + " no intervalo de " + a + " a " + b + ":\n"
                + resultado);
    }
}