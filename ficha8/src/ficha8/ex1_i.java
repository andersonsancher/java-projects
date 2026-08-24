package ficha8;

import javax.swing.JOptionPane;

public class ex1_i {

    public static void main(String[] args) {

        int n;
        int i = 2;
        boolean primo = true;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        do {

            if (n % i == 0 && n != i) {
                primo = false;
            }

            i++;

        } while (i < n);


        if (primo)
            JOptionPane.showMessageDialog(null, "É primo");
        else
            JOptionPane.showMessageDialog(null, "Não é primo");

    }
}