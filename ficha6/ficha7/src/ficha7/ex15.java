package ficha7;

import javax.swing.JOptionPane;

public class ex15 {

    public static void main(String[] args) {

        int dia, mes, ano, resto;
        int dtJuliana;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));

        dtJuliana = (1461 * (ano + 4800 + (mes - 14) / 12)) / 4
                + (367 * (mes - 2 - 12 * ((mes - 14) / 12))) / 12
                - (3 * ((ano + 4900 + (mes - 14) / 12) / 100)) / 4
                + dia - 32075;

        resto = dtJuliana % 7;

        switch (resto) {
            case 0:
                JOptionPane.showMessageDialog(null, "Segunda-feira");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro no cálculo.");
        }
    }
}