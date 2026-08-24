package TIS93;

import javax.swing.JOptionPane;

public class ex19 {

    public static void main(String[] args) {

        int totalSegundos;
        int horas;
        int minutos;
        int segundos;
        int resto;

        totalSegundos = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de segundos:"));

        horas = totalSegundos / 3600;
        resto = totalSegundos % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println(totalSegundos + "s = " +
                horas + "h + " +
                minutos + "m + " +
                segundos + "s");
    }
}