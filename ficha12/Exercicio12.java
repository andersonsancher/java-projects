package ficha12;
import javax.swing.JOptionPane;

// Triângulo 2: classificar por ângulos (Acutângulo, Retângulo, Obtusângulo)
public class Exercicio12 {

    public static String classificarPorAngulos(double a1, double a2, double a3) {
        if (a1 + a2 + a3 != 180) {
            return "Ângulos inválidos: a soma tem de ser 180º";
        }
        if (a1 == 90 || a2 == 90 || a3 == 90) {
            return "Retângulo";
        } else if (a1 > 90 || a2 > 90 || a3 > 90) {
            return "Obtusângulo";
        } else {
            return "Acutângulo";
        }
    }

    public static void main(String[] args) {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Ângulo 1:"));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Ângulo 2:"));
        double a3 = Double.parseDouble(JOptionPane.showInputDialog("Ângulo 3:"));
        JOptionPane.showMessageDialog(null, "O triângulo é: " + classificarPorAngulos(a1, a2, a3));
    }
}
