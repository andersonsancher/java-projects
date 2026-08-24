package ficha9;

import javax.swing.JOptionPane;

public class ex5 {

    public static void main(String[] args) {

        int a, b,num;

        a = Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor de a: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Escreva o valor de b: "));

        for (num = a; num <= b; num++) {

            if (num < 2) {
                continue;
            }

            boolean primo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(num);
            }
        }
    }
}