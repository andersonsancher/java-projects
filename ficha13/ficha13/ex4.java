package ficha13;

import java.util.Scanner;
import java.util.Random;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        final int MAX = 20;
        String[] nomes = new String[MAX];
        int[] idades = new int[MAX];
        int[] vezesGanhou = new int[MAX];
        double[] totalGanho = new double[MAX];
        int numInscritos = 0;

        double valorPremio = 250.0;
        int opcao;

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Inscrições");
            System.out.println("2 - Sorteio");
            System.out.println("3 - Listagem");
            System.out.println("4 - Quem ganhou mais vezes");
            System.out.println("5 - Alterar valor do prémio");
            System.out.println("6 - Quanto já foi dado em prémios");
            System.out.println("7 - Listagem ordenada por nomes (crescente)");
            System.out.println("8 - Listagem ordenada pelo nº de prémios ganhos (decrescente)");
            System.out.println("0 - Sair");
            System.out.print("Opção = ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1: 
                    if (numInscritos >= MAX) {
                        System.out.println("Já não há vagas para mais inscrições.");
                        break;
                    }
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    if (idade < 18) {
                        System.out.println("Inscrição recusada: idade mínima é 18 anos.");
                    } else {
                        nomes[numInscritos] = nome;
                        idades[numInscritos] = idade;
                        vezesGanhou[numInscritos] = 0;
                        totalGanho[numInscritos] = 0;
                        numInscritos++;
                        System.out.println("Inscrição efetuada com sucesso!");
                    }
                    break;

                case 2: 
                    if (numInscritos == 0) {
                        System.out.println("Ainda não há concorrentes inscritos.");
                    } else {
                        int vencedor = rand.nextInt(numInscritos);
                        vezesGanhou[vencedor]++;
                        totalGanho[vencedor] += valorPremio;
                        System.out.println("Parabéns, " + nomes[vencedor] + "! Ganhou " + valorPremio + " euros.");
                    }
                    break;

                case 3: 
                    if (numInscritos == 0) {
                        System.out.println("Ainda não há concorrentes inscritos.");
                    } else {
                        for (int i = 0; i < numInscritos; i++) {
                            System.out.println(nomes[i] + ", de " + idades[i] + " anos, ganhou "
                                    + vezesGanhou[i] + " prémios, no total de " + totalGanho[i] + " euros");
                        }
                    }
                    break;

                case 4: 
                    if (numInscritos == 0) {
                        System.out.println("Ainda não há concorrentes inscritos.");
                    } else {
                        int indiceMax = 0;
                        for (int i = 1; i < numInscritos; i++) {
                            if (vezesGanhou[i] > vezesGanhou[indiceMax]) {
                                indiceMax = i;
                            }
                        }
                        System.out.println(nomes[indiceMax] + " ganhou mais vezes, com "
                                + vezesGanhou[indiceMax] + " prémios.");
                    }
                    break;

                case 5: 
                    System.out.print("Novo valor do prémio: ");
                    valorPremio = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Valor do prémio atualizado para " + valorPremio + " euros.");
                    break;

                case 6: 
                    double totalDado = 0;
                    for (int i = 0; i < numInscritos; i++) {
                        totalDado += totalGanho[i];
                    }
                    System.out.println("Total já dado em prémios: " + totalDado + " euros.");
                    break;

                case 7: 
                    for (int i = 0; i < numInscritos - 1; i++) {
                        for (int j = 0; j < numInscritos - 1 - i; j++) {
                            if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                                
                                String tempNome = nomes[j];
                                nomes[j] = nomes[j + 1];
                                nomes[j + 1] = tempNome;
                                
                                int tempIdade = idades[j];
                                idades[j] = idades[j + 1];
                                idades[j + 1] = tempIdade;
                                
                                int tempVezes = vezesGanhou[j];
                                vezesGanhou[j] = vezesGanhou[j + 1];
                                vezesGanhou[j + 1] = tempVezes;
                                
                                double tempTotal = totalGanho[j];
                                totalGanho[j] = totalGanho[j + 1];
                                totalGanho[j + 1] = tempTotal;
                            }
                        }
                    }
                    for (int i = 0; i < numInscritos; i++) {
                        System.out.println(nomes[i] + ", de " + idades[i] + " anos, ganhou "
                                + vezesGanhou[i] + " prémios, no total de " + totalGanho[i] + " euros");
                    }
                    break;

                case 8: 
                    for (int i = 0; i < numInscritos - 1; i++) {
                        for (int j = 0; j < numInscritos - 1 - i; j++) {
                            if (vezesGanhou[j] < vezesGanhou[j + 1]) { 
                                String tempNome = nomes[j];
                                nomes[j] = nomes[j + 1];
                                nomes[j + 1] = tempNome;

                                int tempIdade = idades[j];
                                idades[j] = idades[j + 1];
                                idades[j + 1] = tempIdade;

                                int tempVezes = vezesGanhou[j];
                                vezesGanhou[j] = vezesGanhou[j + 1];
                                vezesGanhou[j + 1] = tempVezes;

                                double tempTotal = totalGanho[j];
                                totalGanho[j] = totalGanho[j + 1];
                                totalGanho[j + 1] = tempTotal;
                            }
                        }
                    }
                    for (int i = 0; i < numInscritos; i++) {
                        System.out.println(nomes[i] + ", de " + idades[i] + " anos, ganhou "
                                + vezesGanhou[i] + " prémios, no total de " + totalGanho[i] + " euros");
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