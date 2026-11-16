package ficha12;
import javax.swing.JOptionPane;

// Soma de todos os inteiros no intervalo [a, b]
public class Exercicio17 {

    public static int somaIntervalo(int a, int b) {
        int soma = 0;
        for (int i = a; i <= b; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Fim do intervalo (b):"));
        JOptionPane.showMessageDialog(null, "A soma de " + a + " a " + b + " é: " + somaIntervalo(a, b));
    }
}
