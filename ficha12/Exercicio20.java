package ficha12;
import javax.swing.JOptionPane;

// Tabuada de um número N
public class Exercicio20 {

    public static void mostrarTabuada(int n) {
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += n + " x " + i + " = " + (n * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número N:"));
        mostrarTabuada(n);
    }
}
