package ficha12;
import javax.swing.JOptionPane;

// Divisível por 10, 5, 2 ou nenhum deles (método void com parâmetros)
public class Exercicio13 {

    public static void verificarDivisibilidade(int n) {
        if (n % 10 == 0) {
            JOptionPane.showMessageDialog(null, n + " é divisível por 10.");
        } else if (n % 5 == 0) {
            JOptionPane.showMessageDialog(null, n + " é divisível por 5.");
        } else if (n % 2 == 0) {
            JOptionPane.showMessageDialog(null, n + " é divisível por 2.");
        } else {
            JOptionPane.showMessageDialog(null, n + " não é divisível por 10, 5 nem 2.");
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número:"));
        verificarDivisibilidade(n);
    }
}
