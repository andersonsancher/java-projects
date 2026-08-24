package ficha6;

import javax.swing.JOptionPane;

public class ex24 {

    public static void main(String[] args) {
        int n1, n2, n3;
        int maior, meio, menor;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n2: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de n3: "));

        
        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        
        System.out.printf("Ordem decrescente: %d, %d, %d%n", maior, meio, menor);

       
        System.out.printf("Ordem crescente: %d, %d, %d%n", menor, meio, maior);
    }
}