package ficha12;
import javax.swing.JOptionPane;

// Método que encontra os múltiplos de x no intervalo [a, b]
public class Exercicio07 {

    public static void mostrarMultiplos(int x, int a, int b) {
        String resultado = "";
        for (int n = a; n <= b; n++) {
            if (n % x == 0) {
                resultado += n + " ";
            }
        }
        JOptionPane.showMessageDialog(null,
                "Múltiplos de " + x + " no intervalo [" + a + ", " + b + "]: " + resultado);
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Número x:"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Fim do intervalo (b):"));
        mostrarMultiplos(x, a, b);
    }
}
