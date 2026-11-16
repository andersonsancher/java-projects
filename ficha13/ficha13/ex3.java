package ficha13;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        
        int maior = numeros[0];
        int menor = numeros[0];

        
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma = soma + numeros[i];
        }
        soma = soma + numeros[0]; 

        double media = (double) soma / 10; 

        System.out.println("\nMaior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + media);
    }
}