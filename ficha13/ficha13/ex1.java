package ficha13;

import java.util.Scanner;

public class ex1 {
		public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] nomes = new String[3];
        int[] idades = new int[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }
        
        System.out.println("\n--- Resultado ---");
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i] + " tem " + idades[i] + " anos.");}
    }
}