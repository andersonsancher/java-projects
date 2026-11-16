package ficha12;
import javax.swing.JOptionPane;

// Informa se A é múltiplo de B ou vice-versa (método void com parâmetros)
public class Exercicio09 {

    public static void verificarMultiplo(int a, int b) {
        if (a % b == 0 || b % a == 0) {
            JOptionPane.showMessageDialog(null, "Um dos números é múltiplo do outro.");
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum dos números é múltiplo do outro.");
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número B:"));
        verificarMultiplo(a, b);
    }
}
