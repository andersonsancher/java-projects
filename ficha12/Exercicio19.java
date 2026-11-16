package ficha12;
import javax.swing.JOptionPane;

// Números primos no intervalo [a, b]
public class Exercicio19 {

    public static boolean isPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void mostrarPrimos(int a, int b) {
        String resultado = "";
        for (int i = a; i <= b; i++) {
            if (isPrimo(i)) {
                resultado += i + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "Números primos entre " + a + " e " + b + ": " + resultado);
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Fim (b):"));
        mostrarPrimos(a, b);
    }
}
