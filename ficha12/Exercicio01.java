package ficha12;
import javax.swing.JOptionPane;

// Métodos void, SEM parâmetros: os valores são lidos dentro de cada método
public class Exercicio01 {
    static double V, I, R;

    public static void calcularVoltagem() {
        I = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Intensidade (I):"));
        R = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Resistência (R):"));
        V = I * R;
        JOptionPane.showMessageDialog(null, "A Voltagem (V) é: " + V);
    }

    public static void calcularResistencia() {
        V = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Voltagem (V):"));
        I = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Intensidade (I):"));
        R = V / I;
        JOptionPane.showMessageDialog(null, "A Resistência (R) é: " + R);
    }

    public static void calcularIntensidade() {
        V = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Voltagem (V):"));
        R = Double.parseDouble(JOptionPane.showInputDialog("Introduza a Resistência (R):"));
        I = V / R;
        JOptionPane.showMessageDialog(null, "A Intensidade (I) é: " + I);
    }

    public static void main(String[] args) {
        calcularVoltagem();
        calcularResistencia();
        calcularIntensidade();
    }
}
