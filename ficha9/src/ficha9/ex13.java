package ficha9;

public class ex13 {

    public static void main(String[] args) {

        // Cabeçalho
        System.out.print("\t");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "\t");
        }

        System.out.println();

        // Linha separadora
        for (int i = 1; i <= 80; i++) {
            System.out.print("-");
        }

        System.out.println();

        // Tabuada
        for (int linha = 1; linha <= 10; linha++) {

            System.out.print(linha + "|\t");

            for (int coluna = 1; coluna <= 10; coluna++) {
                System.out.print((linha * coluna) + "\t");
            }

            System.out.println();
        }
    }
}