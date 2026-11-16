package ficha12;
import javax.swing.JOptionPane;

// Métodos void, COM parâmetros
public class Exercicio02 {

    public static void calcularVoltagem(double i, double r) {
        double v = i * r;
        JOptionPane.showMessageDialog(null, "A Voltagem (V) é: " + v);
    }

    public static void calcularResistencia(double v, double i) {
        double r = v / i;
        JOptionPane.showMessageDialog(null, "A Resistência (R) é: " + r);
    }

    public static void calcularIntensidade(double v, double r) {
        double i = v / r;
        JOptionPane.showMessageDialog(null, "A Intensidade (I) é: " + i);
    }

    public static void main(String[] args) {
        double i = Double.parseDouble(JOptionPane.showInputDialog("Intensidade (I):"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Resistência (R):"));
        calcularVoltagem(i, r);

        double v = Double.parseDouble(JOptionPane.showInputDialog("Voltagem (V):"));
        calcularResistencia(v, i);
        calcularIntensidade(v, r);
    }
}
