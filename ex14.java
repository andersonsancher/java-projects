package ficha6;

import javax.swing.JOptionPane;

public class ex14 {

    public static void main(String[] args) {

        int numeroLados;
        double lado, area;

        numeroLados = Integer.parseInt(JOptionPane.showInputDialog("Quantos lados tem o polígono?"));

        lado = Double.parseDouble(JOptionPane.showInputDialog("Quantos cm tem cada lado?"));

        if (numeroLados == 3) {

            JOptionPane.showMessageDialog(null,
                    "TRIÂNGULO\nÁrea: fórmula não aprendida.");

        } else if (numeroLados == 4) {

            area = lado * lado;

            JOptionPane.showMessageDialog(null,
                    "QUADRADO\nÁrea = " + area);

        } else if (numeroLados == 5) {

            JOptionPane.showMessageDialog(null, "PENTÁGONO");

        } else {

            JOptionPane.showMessageDialog(null, "Polígono não identificado.");

        }

    }

}