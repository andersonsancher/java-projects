package ficha12;
import javax.swing.JOptionPane;

// Gerar um número aleatório no intervalo [a, b]
public class Exercicio24 {

    public static int numeroAleatorio(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Início do intervalo (a):"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Fim do intervalo (b):"));
        JOptionPane.showMessageDialog(null, "Número aleatório: " + numeroAleatorio(a, b));
    }
}
