package ficha13;


import java.util.Scanner;

public class ex9 {

    static final int MAX = 100;

    
    static class Cliente {
        String nome;
        int idade;
        boolean existe;
    }

    
    static class Carro {
        String marca;
        double preco;
        String tipoCombustivel;
        String estado; 
        boolean existe;
    }

    
    static class Venda {
        int codCliente;
        int codCarro;
        String data;
        boolean existe;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cliente[] clientes = new Cliente[MAX];
        Carro[] carros = new Carro[MAX];
        Venda[] vendas = new Venda[MAX];

        int opcao;

        do {
            System.out.println("\n========== STAND DE VENDAS ==========");
            System.out.println("1 - Inserir Cliente");
            System.out.println("2 - Inserir Carro");
            System.out.println("3 - Inserir Venda");
            System.out.println("4 - Mostrar Clientes");
            System.out.println("5 - Mostrar Carros por Vender");
            System.out.println("6 - Mostrar Vendas (Com total final)");
            System.out.println("0 - Sair");
            System.out.println("=====================================");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                
                case 1:

                    System.out.print("Codigo do cliente (0-99): ");
                    int codCliente = sc.nextInt();
                    sc.nextLine();

                    if (codCliente < 0 || codCliente >= MAX) {
                        System.out.println("Codigo invalido!");
                        break;
                    }

                    if (clientes[codCliente] != null) {
                        System.out.println("Esse cliente ja existe!");
                        break;
                    }

                    Cliente cliente = new Cliente();

                    System.out.print("Nome: ");
                    cliente.nome = sc.nextLine();

                    System.out.print("Idade: ");
                    cliente.idade = sc.nextInt();
                    sc.nextLine();

                    cliente.existe = true;

                    clientes[codCliente] = cliente;

                    System.out.println("Cliente inserido com sucesso!");

                    break;

                
                case 2:

                    System.out.print("Codigo do carro (0-99): ");
                    int codCarro = sc.nextInt();
                    sc.nextLine();

                    if (codCarro < 0 || codCarro >= MAX) {
                        System.out.println("Codigo invalido!");
                        break;
                    }

                    if (carros[codCarro] != null) {
                        System.out.println("Esse carro ja existe!");
                        break;
                    }

                    Carro carro = new Carro();

                    System.out.print("Marca: ");
                    carro.marca = sc.nextLine();

                    System.out.print("Preco: ");
                    carro.preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Tipo de combustivel: ");
                    carro.tipoCombustivel = sc.nextLine();

                    
                    carro.estado = "paraVenda";
                    carro.existe = true;

                    carros[codCarro] = carro;

                    System.out.println("Carro inserido com sucesso!");

                    break;

                
                case 3:

                    System.out.print("Codigo da venda (0-99): ");
                    int codVenda = sc.nextInt();

                    if (codVenda < 0 || codVenda >= MAX) {
                        System.out.println("Codigo invalido!");
                        break;
                    }

                    if (vendas[codVenda] != null) {
                        System.out.println("Essa venda ja existe!");
                        break;
                    }

                    System.out.print("Codigo do cliente: ");
                    int clienteVenda = sc.nextInt();

                    if (clienteVenda < 0 ||
                            clienteVenda >= MAX ||
                            clientes[clienteVenda] == null) {

                        System.out.println("Cliente inexistente!");
                        break;
                    }

                    System.out.print("Codigo do carro: ");
                    int carroVenda = sc.nextInt();
                    sc.nextLine();

                    if (carroVenda < 0 ||
                            carroVenda >= MAX ||
                            carros[carroVenda] == null) {

                        System.out.println("Carro inexistente!");
                        break;
                    }

                    
                    if (carros[carroVenda].estado.equals("vendido")) {
                        System.out.println("Esse carro ja foi vendido!");
                        break;
                    }

                    Venda venda = new Venda();

                    venda.codCliente = clienteVenda;
                    venda.codCarro = carroVenda;

                    System.out.print("Data (DD/MM/AAAA): ");
                    venda.data = sc.nextLine();

                    venda.existe = true;

                    vendas[codVenda] = venda;

                    
                    carros[carroVenda].estado = "vendido";

                    System.out.println("Venda registada com sucesso!");

                    break;

                
                case 4:

                    System.out.println("\n========== CLIENTES ==========");

                    for (int i = 0; i < MAX; i++) {

                        if (clientes[i] != null) {

                            System.out.println("\nCodigo: " + i);
                            System.out.println("Nome: " +
                                    clientes[i].nome);
                            System.out.println("Idade: " +
                                    clientes[i].idade);
                        }
                    }

                    break;

                
                case 5:

                    System.out.println("\n====== CARROS POR VENDER ======");

                    for (int i = 0; i < MAX; i++) {

                        if (carros[i] != null &&
                                carros[i].estado.equals("paraVenda")) {

                            System.out.println("\nCodigo: " + i);
                            System.out.println("Marca: " +
                                    carros[i].marca);
                            System.out.println("Preco: " +
                                    carros[i].preco + " euros");
                            System.out.println("Combustivel: " +
                                    carros[i].tipoCombustivel);
                            System.out.println("Estado: " +
                                    carros[i].estado);
                        }
                    }

                    break;

                
                case 6:

                    double total = 0;

                    System.out.println("\n============ VENDAS ============");

                    for (int i = 0; i < MAX; i++) {

                        if (vendas[i] != null) {

                            int c = vendas[i].codCliente;
                            int car = vendas[i].codCarro;

                            System.out.println("\nCodigo da venda: " + i);

                            System.out.println("Cliente: " +
                                    clientes[c].nome);

                            System.out.println("Carro: " +
                                    carros[car].marca);

                            System.out.println("Preco: " +
                                    carros[car].preco + " euros");

                            System.out.println("Data: " +
                                    vendas[i].data);

                            total += carros[car].preco;
                        }
                    }

                    System.out.println("\n-------------------------------");
                    System.out.println("TOTAL FINAL: " + total + " euros");
                    System.out.println("-------------------------------");

                    break;

                
                case 0:

                    System.out.println("A sair do programa...");

                    break;

                default:

                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
