package ficha13;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 10;

        // Clientes
        String[] nomeCliente = new String[MAX];
        int[] idadeCliente = new int[MAX];
        int numClientes = 0;

        // Ofertas de viagem
        String[] destino = new String[MAX];
        double[] precoDiaPessoa = new double[MAX];
        int numOfertas = 0;

        // Viagens marcadas
        int[] codClienteViagem = new int[MAX];
        int[] codViagemViagem = new int[MAX];
        int[] numDias = new int[MAX];
        int[] numPessoas = new int[MAX];
        String[] dataViagem = new String[MAX];
        int numViagensMarcadas = 0;

        int opcao;

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Inserir Cliente (Nome, idade)");
            System.out.println("2 - Inserir Oferta Viagem (Destino, Preço/Dia/Pessoa)");
            System.out.println("3 - Inserir (Marcar) Viagem Cliente (codCliente, codViagem, dias, pessoas, Data)");
            System.out.println("4 - Mostrar Clientes");
            System.out.println("5 - Mostrar Ofertas de Viagem");
            System.out.println("6 - Mostrar Viagens Marcadas (Com total final)");
            System.out.println("0 - Sair");
            System.out.print("Opção = ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1: // Inserir Cliente
                    if (numClientes >= MAX) {
                        System.out.println("Não é possível inserir mais clientes.");
                        break;
                    }
                    System.out.print("Nome: ");
                    nomeCliente[numClientes] = sc.nextLine();
                    System.out.print("Idade: ");
                    idadeCliente[numClientes] = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Cliente inserido com o código " + numClientes);
                    numClientes++;
                    break;

                case 2: // Inserir Oferta de Viagem
                    if (numOfertas >= MAX) {
                        System.out.println("Não é possível inserir mais ofertas.");
                        break;
                    }
                    System.out.print("Destino: ");
                    destino[numOfertas] = sc.nextLine();
                    System.out.print("Preço por dia/pessoa: ");
                    precoDiaPessoa[numOfertas] = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Oferta inserida com o código " + numOfertas);
                    numOfertas++;
                    break;

                case 3: // Marcar Viagem
                    if (numClientes == 0 || numOfertas == 0) {
                        System.out.println("É preciso haver pelo menos um cliente e uma oferta.");
                        break;
                    }
                    if (numViagensMarcadas >= MAX) {
                        System.out.println("Não é possível marcar mais viagens.");
                        break;
                    }

                    System.out.print("Código do Cliente (0 a " + (numClientes - 1) + "): ");
                    int codCli = sc.nextInt();
                    sc.nextLine();
                    if (codCli < 0 || codCli >= numClientes) {
                        System.out.println("Código de cliente inválido.");
                        break;
                    }

                    System.out.print("Código da Viagem (0 a " + (numOfertas - 1) + "): ");
                    int codVia = sc.nextInt();
                    sc.nextLine();
                    if (codVia < 0 || codVia >= numOfertas) {
                        System.out.println("Código de viagem inválido.");
                        break;
                    }

                    System.out.print("Número de dias: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Número de pessoas: ");
                    int pessoas = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Data: ");
                    String data = sc.nextLine();

                    codClienteViagem[numViagensMarcadas] = codCli;
                    codViagemViagem[numViagensMarcadas] = codVia;
                    numDias[numViagensMarcadas] = dias;
                    numPessoas[numViagensMarcadas] = pessoas;
                    dataViagem[numViagensMarcadas] = data;
                    numViagensMarcadas++;

                    System.out.println("Viagem marcada com sucesso!");
                    break;

                case 4: // Mostrar Clientes
                    if (numClientes == 0) {
                        System.out.println("Ainda não há clientes inseridos.");
                    } else {
                        for (int i = 0; i < numClientes; i++) {
                            System.out.println("Código " + i + " - " + nomeCliente[i] + ", " + idadeCliente[i] + " anos");
                        }
                    }
                    break;

                case 5: // Mostrar Ofertas
                    if (numOfertas == 0) {
                        System.out.println("Ainda não há ofertas inseridas.");
                    } else {
                        for (int i = 0; i < numOfertas; i++) {
                            System.out.println("Código " + i + " - " + destino[i] + ", " + precoDiaPessoa[i] + " €/dia/pessoa");
                        }
                    }
                    break;

                case 6: // Mostrar Viagens Marcadas
                    if (numViagensMarcadas == 0) {
                        System.out.println("Ainda não há viagens marcadas.");
                    } else {
                        for (int i = 0; i < numViagensMarcadas; i++) {
                            int cCli = codClienteViagem[i];
                            int cVia = codViagemViagem[i];
                            double total = precoDiaPessoa[cVia] * numDias[i] * numPessoas[i];

                            System.out.println(nomeCliente[cCli] + " marcou viagem para " + destino[cVia]
                                    + ", " + numDias[i] + " dias, " + numPessoas[i] + " pessoas, em " + dataViagem[i]
                                    + " - Total: " + total + " euros");
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
