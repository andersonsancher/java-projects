package ficha13;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] idades = new int[10];
        String[] localidades = new String[10];
        int numClientes = 0; 

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir novo cliente");
            System.out.println("2 - Mostrar cliente x");
            System.out.println("3 - Mostrar todos os clientes");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    if (numClientes < 10) {
                        System.out.print("Nome: ");
                        nomes[numClientes] = sc.nextLine();

                        System.out.print("Idade: ");
                        idades[numClientes] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Localidade: ");
                        localidades[numClientes] = sc.nextLine();

                        numClientes++; 
                        System.out.println("Cliente inserido com sucesso!");
                    } else {
                        System.out.println("Não é possível inserir mais clientes (limite de 10 atingido).");
                    }
                    break;

                case 2:
                    System.out.print("Qual o número do cliente (1 a " + numClientes + ")? ");
                    int x = sc.nextInt();
                    sc.nextLine();

                    if (x >= 1 && x <= numClientes) {
                        int idx = x - 1; 
                        System.out.println("Nome: " + nomes[idx]);
                        System.out.println("Idade: " + idades[idx]);
                        System.out.println("Localidade: " + localidades[idx]);
                    } else {
                        System.out.println("Cliente inválido.");
                    }
                    break;

                case 3:
                    if (numClientes == 0) {
                        System.out.println("Ainda não há clientes inseridos.");
                    } else {
                        for (int i = 0; i < numClientes; i++) {
                            System.out.println((i + 1) + " - " + nomes[i] + ", " + idades[i] + " anos, " + localidades[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("A sair...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
    
