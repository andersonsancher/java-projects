package ficha8;

import javax.swing.JOptionPane;

public class ex15 {

    public static void main(String[] args) {

        int opcao;
        double euros, convertido;

        euros = 0;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Ler valor em Euros\n" +
                    "2 - Converter para Dólares\n" +
                    "3 - Converter para Libras\n" +
                    "4 - Converter para Francos Suíços\n" +
                    "5 - Converter para Yuan\n" +
                    "0 - Sair", "Digite aqui..."));

            switch (opcao) {

                case 1:
                    euros = Double.parseDouble(
                            JOptionPane.showInputDialog("Introduza o valor em Euros:"));
                    break;

                case 2:
                    convertido = euros * 1.09;
                    JOptionPane.showMessageDialog(null,
                            euros + " € = " + convertido + " Dólares");
                    break;

                case 3:
                    convertido = euros * 0.86;
                    JOptionPane.showMessageDialog(null,
                            euros + " € = " + convertido + " Libras");
                    break;

                case 4:
                    convertido = euros * 0.95;
                    JOptionPane.showMessageDialog(null,
                            euros + " € = " + convertido + " Francos Suíços");
                    break;

                case 5:
                    convertido = euros * 7.85;
                    JOptionPane.showMessageDialog(null,
                            euros + " € = " + convertido + " Yuan");
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Programa terminado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");

            }

        } while (opcao != 0);

    }

}