package ficha12;
import javax.swing.JOptionPane;

// Conversão de euros para outras moedas, com menu
// (taxas de câmbio aproximadas, apenas para efeitos do exercício)
public class Exercicio15 {

    public static double converter(double euros, int opcao) {
        switch (opcao) {
            case 1: return euros * 1.09;   // Dólares (USA)
            case 2: return euros * 0.87;   // Libras (UK)
            case 3: return euros * 7.85;   // Yuan (China)
            case 4: return euros * 0.95;   // Franco Suíço
            default: return -1;
        }
    }

    public static void main(String[] args) {
        double euros = Double.parseDouble(JOptionPane.showInputDialog("Quantidade em euros:"));
        String menu = "1 - Dólares (USA)\n2 - Libras (UK)\n3 - Yuan (China)\n4 - Franco Suíço";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        double resultado = converter(euros, opcao);
        if (resultado == -1) {
            JOptionPane.showMessageDialog(null, "Opção inválida.");
        } else {
            JOptionPane.showMessageDialog(null, euros + " € = " + resultado);
        }
    }
}
