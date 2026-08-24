package ficha9;

import javax.swing.JOptionPane;

public class ex7 {

    public static void main(String[] args) {

        int num;
        int dentro = 0;
        int fora = 0;

        for (int i = 1; i <= 10; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escreva o " + i + "º número: "));

            if (num >= 10 && num <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.println("Números no intervalo [10,20]: " + dentro);
        System.out.println("Números fora do intervalo: " + fora);
    }
}