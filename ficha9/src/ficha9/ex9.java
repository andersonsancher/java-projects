package ficha9;

import javax.swing.JOptionPane;

public class ex9 {

    public static void main(String[] args) {

        int n;
        String resultado = "";

        n = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número da tabuada:"));

        for (int i = 1; i <= 10; i++) {
            resultado = resultado + n + " X " + i + " = " + (n * i) + "\n";
        }

        JOptionPane.showMessageDialog(null, "Tabuada de " + n + ":\n" + resultado);
    }
}