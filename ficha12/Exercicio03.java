package ficha12;
import javax.swing.JOptionPane;

// Métodos de um tipo (retornam double), COM parâmetros
public class Exercicio03 {

    public static double calcularVoltagem(double i, double r) {
        return i * r;
    }

    public static double calcularResistencia(double v, double i) {
        return v / i;
    }

    public static double calcularIntensidade(double v, double r) {
        return v / r;
    }

    public static void main(String[] args) {
        double i = Double.parseDouble(JOptionPane.showInputDialog("Intensidade (I):"));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Resistência (R):"));
        double v = calcularVoltagem(i, r);
        JOptionPane.showMessageDialog(null, "V = " + v + "\nR = " + calcularResistencia(v, i)
                + "\nI = " + calcularIntensidade(v, r));
    }
}
