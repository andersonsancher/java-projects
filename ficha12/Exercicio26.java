package ficha12;
import java.util.Arrays;
import javax.swing.JOptionPane;

// Euromilhões: 5 números (1-50) e 2 estrelas (1-12), sem repetição
public class Exercicio26 {

    public static int[] gerarNumeros(int quantidade, int max) {
        int[] numeros = new int[quantidade];
        int count = 0;
        while (count < quantidade) {
            int n = 1 + (int) (Math.random() * max);
            boolean repetido = false;
            for (int i = 0; i < count; i++) {
                if (numeros[i] == n) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                numeros[count] = n;
                count++;
            }
        }
        return numeros;
    }

    public static void main(String[] args) {
        int[] numeros = gerarNumeros(5, 50);
        int[] estrelas = gerarNumeros(2, 12);

        Arrays.sort(numeros);
        Arrays.sort(estrelas);

        JOptionPane.showMessageDialog(null,
                "Números: " + Arrays.toString(numeros) +
                "\nEstrelas: " + Arrays.toString(estrelas));
    }
}
