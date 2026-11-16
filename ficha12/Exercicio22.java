package ficha12;
import javax.swing.JOptionPane;

// Fatorial de um número entre 1 e 20
public class Exercicio22 {

    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduza um número (1-20):"));
        JOptionPane.showMessageDialog(null, n + "! = " + fatorial(n));
    }
}
