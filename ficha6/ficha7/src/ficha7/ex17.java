package ficha7;

import javax.swing.JOptionPane;

public class ex17 {

    public static void main(String[] args) {

        int dia, mes, ano, N, Z;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

        // Concatenação: DMA
        N = Integer.parseInt("" + dia + mes + ano);

        Z = N % 9;

        switch (Z) {
            case 1:
                JOptionPane.showMessageDialog(null, "Tipo: Irresistível");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Tipo: Impetuoso");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Tipo: Discreto");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Tipo: Amoroso");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Tipo: Tímido");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Tipo: Conquistador");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Tipo: Estudioso");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Tipo: Sonhador");
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Tipo: Charmoso");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro.");
        }
    }
}