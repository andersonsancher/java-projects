package ficha6;

import javax.swing.JOptionPane;

public class ex3 {

    public static void main(String[] args) {

        String sexo;
        double altura;
        double mulher;
        double homem;

        sexo = JOptionPane.showInputDialog("Sexo (H ou M):");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura (m)?"));

        mulher = (62.1 * altura) - 44.7;
        homem = (72.7 * altura) - 58;

        if (sexo.equalsIgnoreCase("M")) {
            System.out.println("Peso ideal: " + mulher + " kg");
        } else if (sexo.equalsIgnoreCase("H")) {
            System.out.println("Peso ideal: " + homem + " kg");
        } else {
            System.out.println("Sexo inválido.");
        }
    }
}