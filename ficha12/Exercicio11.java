package ficha12;
import javax.swing.JOptionPane;

// Triângulo 1: classificar por lados (Equilátero, Isósceles, Escaleno)
public class Exercicio11 {

    public static String classificarPorLados(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Lado A:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Lado B:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Lado C:"));
        JOptionPane.showMessageDialog(null, "O triângulo é: " + classificarPorLados(a, b, c));
    }
}
