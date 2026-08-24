package ficha6;

import javax.swing.JOptionPane;

public class ex26 {

    public static void main(String[] args) {
        double a, b, c;
        double delta;
        double r1, r2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "A equação não tem raízes reais.");
        } else if (delta == 0) {
            r1 = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "A equação tem uma raiz real: " + r1);
        } else {
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "A equação tem duas raízes reais:\nr1 = " + r1 + "\nr2 = " + r2);
        }
    }
}