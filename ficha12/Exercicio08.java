package ficha12;
import javax.swing.JOptionPane;

// Terrenos: terrenosA (A-C-D-E-F-G) vs terrenosB (B-C-D-H-I-J)
// NOTA IMPORTANTE: as áreas de cada letra (A, B, C...) dependem das medidas
// exatas da figura da ficha. Abaixo estão valores estimados a partir do
// desenho (em m²) — confirme com as medidas reais e ajuste o método area()
// se forem diferentes.
public class Exercicio08 {

    public static double area(char letra) {
        switch (letra) {
            case 'A': return 50;  // 10 x 5
            case 'B': return 50;  // 10 x 5
            case 'C': return 30;  // 3 x 10
            case 'D': return 30;  // 3 x 10
            case 'E': return 12;
            case 'F': return 18;
            case 'G': return 16;  // 4 x 4
            case 'H': return 12;
            case 'I': return 9;
            case 'J': return 24;  // 4 x 6
            default: return 0;
        }
    }

    // preço aleatório por m2, entre 100 e 200 euros
    public static double precoM2() {
        return 100 + Math.random() * 100;
    }

    public static double calcularPrecoTotal(char[] terreno) {
        double total = 0;
        for (char letra : terreno) {
            total += area(letra) * precoM2();
        }
        return total;
    }

    public static void main(String[] args) {
        char[] terrenosA = {'A', 'C', 'D', 'E', 'F', 'G'};
        char[] terrenosB = {'B', 'C', 'D', 'H', 'I', 'J'};

        double totalA = calcularPrecoTotal(terrenosA);
        double totalB = calcularPrecoTotal(terrenosB);

        String mensagem = String.format(
                "Preço total terrenosA: %.2f €\nPreço total terrenosB: %.2f €\n\n",
                totalA, totalB);

        if (totalA < totalB) {
            mensagem += "Opção mais barata: terrenosA";
        } else if (totalB < totalA) {
            mensagem += "Opção mais barata: terrenosB";
        } else {
            mensagem += "Os dois têm o mesmo preço";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
