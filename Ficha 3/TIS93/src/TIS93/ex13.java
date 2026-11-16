package TIS93;

import javax.swing.JOptionPane;

public class ex13 {

    public static void main(String[] args) {

        double teste1, teste2;
        double trab1, trab2, trab3;
        double trabalhoFinal;

        double mediaTestes, mediaTrabalhos;
        double notaFinal;

        
        teste1 = Double.parseDouble(JOptionPane.showInputDialog("Nota do teste 1:"));
        teste2 = Double.parseDouble(JOptionPane.showInputDialog("Nota do teste 2:"));

        trab1 = Double.parseDouble(JOptionPane.showInputDialog("Trabalho prático 1:"));
        trab2 = Double.parseDouble(JOptionPane.showInputDialog("Trabalho prático 2:"));
        trab3 = Double.parseDouble(JOptionPane.showInputDialog("Trabalho prático 3:"));

       
        trabalhoFinal = Double.parseDouble(JOptionPane.showInputDialog("Trabalho final:"));

        
        mediaTestes = (teste1 + teste2) / 2;
        mediaTrabalhos = (trab1 + trab2 + trab3) / 3;

        
        notaFinal = (mediaTestes * 0.60) +
                    (mediaTrabalhos * 0.20) +
                    (trabalhoFinal * 0.20);

        System.out.println("Nota final do aluno: " + String.format("%.2f", notaFinal));
    }
}