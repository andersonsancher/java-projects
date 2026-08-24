package ficha6;

import javax.swing.JOptionPane;

public class ex8 {

    public static void main(String[] args) {

        int ano;

        ano = Integer.parseInt(JOptionPane.showInputDialog("Escreva um ano:"));

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano +" O ano é bissexto.");
        } else {
            System.out.println(ano + " O ano não é bissexto.");
        }
    }
}