package ficha12;
import javax.swing.JOptionPane;

// Par ou ímpar — método boolean com parâmetros
public class Exercicio10 {

    public static boolean isPar(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número:"));
        if (isPar(n)) {
            JOptionPane.showMessageDialog(null, n + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, n + " é ímpar.");
        }
    }
}
