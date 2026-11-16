package ficha13;


import java.util.Scanner;

public class ex10 {

    
    public static void desenharTabuleiro(String[][] tabuleiro) {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            System.out.println(" " + tabuleiro[i][0] + " | "
                    + tabuleiro[i][1] + " | "
                    + tabuleiro[i][2]);

            if (i < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    
    public static boolean verificarVencedor(String[][] tabuleiro,
                                            String jogador) {

        
        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0].equals(jogador) &&
                tabuleiro[i][1].equals(jogador) &&
                tabuleiro[i][2].equals(jogador)) {

                return true;
            }
        }

        
        for (int j = 0; j < 3; j++) {

            if (tabuleiro[0][j].equals(jogador) &&
                tabuleiro[1][j].equals(jogador) &&
                tabuleiro[2][j].equals(jogador)) {

                return true;
            }
        }

        
        if (tabuleiro[0][0].equals(jogador) &&
            tabuleiro[1][1].equals(jogador) &&
            tabuleiro[2][2].equals(jogador)) {

            return true;
        }

        
        if (tabuleiro[0][2].equals(jogador) &&
            tabuleiro[1][1].equals(jogador) &&
            tabuleiro[2][0].equals(jogador)) {

            return true;
        }

        return false;
    }

    
    public static boolean tabuleiroCheio(String[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j].equals(" ")) {
                    return false;
                }
            }
        }

        return true;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        String[][] tabuleiro = new String[3][3];

        
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tabuleiro[i][j] = " ";
            }
        }

        String jogador = "X";
        int jogadas = 0;
        boolean terminou = false;

        
        while (!terminou) {

            
            desenharTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogador);

            int linha;
            int coluna;

            
            while (true) {

                System.out.print("Escolha a linha (0-2): ");
                linha = sc.nextInt();

                System.out.print("Escolha a coluna (0-2): ");
                coluna = sc.nextInt();

                
                if (linha < 0 || linha > 2 ||
                    coluna < 0 || coluna > 2) {

                    System.out.println("Posicao invalida!");
                    System.out.println("A linha e a coluna devem estar entre 0 e 2.");
                }

                
                else if (!tabuleiro[linha][coluna].equals(" ")) {

                    System.out.println("Essa posicao ja esta ocupada!");
                }

                
                else {
                    break;
                }
            }

            
            tabuleiro[linha][coluna] = jogador;

            
            jogadas++;

            
            if (verificarVencedor(tabuleiro, jogador)) {

                desenharTabuleiro(tabuleiro);

                System.out.println("Jogador " + jogador + " venceu!");
                terminou = true;
            }

            
            else if (jogadas == 9) {

                desenharTabuleiro(tabuleiro);

                System.out.println("Empate! Deu velha.");
                terminou = true;
            }

            
            else {

                if (jogador.equals("X")) {
                    jogador = "O";
                } else {
                    jogador = "X";
                }
            }
        }

        sc.close();
    }
}
