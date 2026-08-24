package ficha8;

import javax.swing.JOptionPane;

public class ex4 {

    public static void main(String[] args) {

        int opcao = 0;
        int quantidade = 0;
        double soma = 0;
        double menor = 0;
        double maior = 0;
        double n = 0;
        double media = 0;
        String s = "";

        String menu = "MENU\n"
                + "1 - Introduzir número\n"
                + "2 - Mostrar Maior\n"
                + "3 - Mostrar Menor\n"
                + "4 - Mostrar Soma\n"
                + "5 - Mostrar Média\n"
                + "0 - Sair\n"
                + "Escolha uma Opção:";

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {

                case 1:

                    n = Double.parseDouble(
                            JOptionPane.showInputDialog("Digite um número:")
                    );

                    s += n + ",";

                    if (quantidade == 0) {
                        maior = n;
                        menor = n;
                    } else {

                        if (n > maior) {
                            maior = n;
                        }

                        if (n < menor) {
                            menor = n;
                        }
                    }

                    soma += n;
                    quantidade++;

                    media = soma / quantidade;

                    break;


                case 2:

                    if (quantidade == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Ainda não existem números introduzidos.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "O maior número é: " + maior);
                    }

                    break;


                case 3:

                    if (quantidade == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Ainda não existem números introduzidos.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "O menor número é: " + menor);
                    }

                    break;


                case 4:

                    JOptionPane.showMessageDialog(null,
                            "A soma é: " + soma);

                    break;


                case 5:

                    if (quantidade == 0) {
                        JOptionPane.showMessageDialog(null,
                                "Ainda não existem números introduzidos.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "A média é: " + media);
                    }

                    break;


                case 0:

                    JOptionPane.showMessageDialog(null,
                            "Programa terminado.");

                    break;


                default:

                    JOptionPane.showMessageDialog(null,
                            "Opção inválida.");

            }

        } while (opcao != 0);

    }
}