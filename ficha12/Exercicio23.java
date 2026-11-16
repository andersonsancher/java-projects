package ficha12;
import javax.swing.JOptionPane;

// Patterns - square numbers (alíneas a) e b), para qualquer n)
public class Exercicio23 {

    // a) cada linha repete o número da linha (0,0,0,0,0 / 1,1,1,1,1 / ...)
    public static void patternA(int n) {
        String resultado = "";
        for (int l = 0; l < n; l++) {
            for (int c = 1; c <= n; c++) {
                resultado += l + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    // b) cada linha repete a sequência 1,2,3,4,5
    public static void patternB(int n) {
        String resultado = "";
        for (int l = 1; l <= n; l++) {
            for (int c = 1; c <= n; c++) {
                resultado += c + " ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Introduza o valor de n:"));
        patternA(n);
        patternB(n);
    }
}
