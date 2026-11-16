package ficha12;
import javax.swing.JOptionPane;

// Potências sem usar Math.pow
public class Exercicio21 {

    public static long potencia(int base, int expoente) {
        long resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Base:"));
        int expoente = Integer.parseInt(JOptionPane.showInputDialog("Expoente:"));
        JOptionPane.showMessageDialog(null, base + "^" + expoente + " = " + potencia(base, expoente));
    }
}
