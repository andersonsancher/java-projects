package ficha12;
import javax.swing.JOptionPane;

// Dias do mês, usando switch-case (fevereiro simplificado, sem ano bissexto)
public class Exercicio16 {

    public static int diasDoMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Introduza o mês (1-12):"));
        int dias = diasDoMes(mes);
        if (dias == -1) {
            JOptionPane.showMessageDialog(null, "Mês inválido.");
        } else {
            JOptionPane.showMessageDialog(null, "O mês " + mes + " tem " + dias + " dias.");
        }
    }
}
