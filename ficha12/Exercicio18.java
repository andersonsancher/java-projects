package ficha12;
import javax.swing.JOptionPane;

// Lista os múltiplos de n no intervalo [a, b] (método que devolve uma String)
public class Exercicio18 {

    public static String listarMultiplos(int n, int a, int b) {
        String resultado = "";
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                resultado += i + " ";
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Número n:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Fim (b):"));
        JOptionPane.showMessageDialog(null, "Múltiplos de " + n + ": " + listarMultiplos(n, a, b));
    }
}
