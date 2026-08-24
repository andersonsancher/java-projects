package ficha6;

import javax.swing.JOptionPane;

public class ex25 {

    public static void main(String[] args) {
        int n1, n2, n3;
        int menor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n3: "));

        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        JOptionPane.showMessageDialog(null, "O menor valor é: " + menor);
    }
}