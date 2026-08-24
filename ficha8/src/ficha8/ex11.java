package ficha8;

import javax.swing.JOptionPane;

public class ex11 {

    public static void main(String[] args) {

        int n, i;
        String resultado = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número da tabuada:"));

        i = 1;

        do {

            resultado = resultado + n + " X " + i + " = " + (n * i) + "\n";

            i++;

        } while (i <= 10);

        JOptionPane.showMessageDialog(null, "Tabuada de " + n + ":\n" + resultado);

    }

}