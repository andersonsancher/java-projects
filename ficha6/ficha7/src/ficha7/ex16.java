package ficha7;

import javax.swing.JOptionPane;

public class ex16 {

    public static void main(String[] args) {

        int km, carro;
        double consumo;

        String menu = "Tipo de carro:\n\n"
                + "1 - Tipo A (12 km/L)\n"
                + "2 - Tipo B (9 km/L)\n"
                + "3 - Tipo C (8 km/L)";

        JOptionPane.showMessageDialog(null, menu);

        km = Integer.parseInt(JOptionPane.showInputDialog("Quantos km irá percorrer?"));
        carro = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de carro (1, 2 ou 3):"));

        switch (carro) {
            case 1:
                consumo = km / 12.0;
                JOptionPane.showMessageDialog(null,
                        "Consumo estimado: " + consumo + " litros.");
                break;

            case 2:
                consumo = km / 9.0;
                JOptionPane.showMessageDialog(null,
                        "Consumo estimado: " + consumo + " litros.");
                break;

            case 3:
                consumo = km / 8.0;
                JOptionPane.showMessageDialog(null,
                        "Consumo estimado: " + consumo + " litros.");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Tipo de carro inválido!");
        }
    }
}