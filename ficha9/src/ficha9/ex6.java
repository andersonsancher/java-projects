package ficha9;

import javax.swing.JOptionPane;

public class ex6 {

    public static void main(String[] args) {

        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {

            num = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escreva o " + i + "º número: "));

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}