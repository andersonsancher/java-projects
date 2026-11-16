package ficha12;
import javax.swing.JOptionPane;

// Menor de quatro números
public class Exercicio14 {

    public static int menor(int a, int b, int c, int d) {
        int m = a;
        if (b < m) m = b;
        if (c < m) m = c;
        if (d < m) m = d;
        return m;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Número 3:"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Número 4:"));
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor(a, b, c, d));
    }
}
