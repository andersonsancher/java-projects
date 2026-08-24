package ficha7;

import javax.swing.JOptionPane;

public class ex1 {

    public static void main(String[] args) {
        int num1, num2, opcao;
        double resultado;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n1 - Somar\n2 - Diminuir\n3 - Multiplicar\n4 - Dividir\n5 - Resto da divisão inteira\n\nEscolha a operação:"));

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    resultado = 0;
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                }
                break;
            case 5:
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    resultado = 0;
                    JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                }
                break;
            default:
                resultado = 0;
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }

        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
    }
}