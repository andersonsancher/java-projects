package ficha12;
import javax.swing.JOptionPane;

// Combinações simples: Cn,p = n! / (p! * (n-p)!)
// Nota: para n=50 o fatorial "puro" seria enorme e não cabe num long,
// por isso a combinação é calculada de forma direta (sem passar pelo
// fatorial completo de 50), evitando overflow.
public class Exercicio25 {

    public static long combinacao(int n, int p) {
        long numerador = 1;
        for (int i = 0; i < p; i++) {
            numerador *= (n - i);
        }
        long denominador = 1;
        for (int i = 1; i <= p; i++) {
            denominador *= i;
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        long c50_5 = combinacao(50, 5);
        long c12_2 = combinacao(12, 2);
        long combinacaoTotal = c50_5 * c12_2;

        JOptionPane.showMessageDialog(null,
                "C(50,5) = " + c50_5 +
                "\nC(12,2) = " + c12_2 +
                "\nCombinações totais do Euromilhões = " + combinacaoTotal);
    }
}
