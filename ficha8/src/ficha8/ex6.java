package ficha8;

import javax.swing.JOptionPane;

public class ex6 {

    public static void main(String[] args) {

        int resultado = 1;
        int contador = 1;
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        do {

            resultado = resultado * contador;
            contador++;

        } while (contador <= num);

        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é " + resultado);

    }

}