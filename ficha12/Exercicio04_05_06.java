package ficha12;
import javax.swing.JOptionPane;

// pedirNumInt, pedirNumDouble e pedirString (exercícios 4, 5 e 6 juntos, pois são
// métodos auxiliares que se usam em conjunto)
public class Exercicio04_05_06 {

    public static int pedirNumInt(String s) {
        return Integer.parseInt(JOptionPane.showInputDialog(s));
    }

    public static double pedirNumDouble(String s) {
        return Double.parseDouble(JOptionPane.showInputDialog(s));
    }

    public static String pedirString(String s) {
        return JOptionPane.showInputDialog(s);
    }

    public static void main(String[] args) {
        int idade = pedirNumInt("Introduza a sua idade:");
        double altura = pedirNumDouble("Introduza a sua altura (m):");
        String nome = pedirString("Introduza o seu nome:");

        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }
}
