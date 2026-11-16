package ficha12;
import javax.swing.JOptionPane;

// Acerta no número: o programa escolhe um número entre 1 e 100 e
// o utilizador tenta adivinhar
public class Exercicio27 {

    public static void jogoAdivinhar() {
        int numeroSecreto = 1 + (int) (Math.random() * 100);
        int tentativas = 0;
        int palpite;

        do {
            palpite = Integer.parseInt(
                    JOptionPane.showInputDialog("Tente adivinhar o número (1 a 100):"));
            tentativas++;

            if (palpite > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Número introduzido é mais alto");
            } else if (palpite < numeroSecreto) {
                JOptionPane.showMessageDialog(null, "Número introduzido é mais baixo");
            } else {
                JOptionPane.showMessageDialog(null, "Acertou em " + tentativas + " tentativas");
            }
        } while (palpite != numeroSecreto);
    }

    public static void main(String[] args) {
        jogoAdivinhar();
    }
}
