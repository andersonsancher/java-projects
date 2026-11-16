package TIS93;

import javax.swing.JOptionPane;

public class ex16 {

    public static void main(String[] args) {

        
        double precoHamburguer = 2.0;
        double precoCheeseburger = 2.5;
        double precoBatata = 0.75;
        double precoSumo = 1.0;

        
        System.out.println("MENU");
        System.out.println("Hamburger: " + precoHamburguer + " euros");
        System.out.println("Cheeseburger: " + precoCheeseburger + " euros");
        System.out.println("Batatas fritas: " + precoBatata + " euros");
        System.out.println("Sumo: " + precoSumo + " euro");

        
        int hamburgers = Integer.parseInt(JOptionPane.showInputDialog("Hamburgers?"));
        int cheeseburgers = Integer.parseInt(JOptionPane.showInputDialog("Cheeseburgers?"));
        int batatas = Integer.parseInt(JOptionPane.showInputDialog("Batatas fritas?"));
        int sumos = Integer.parseInt(JOptionPane.showInputDialog("Sumos?"));

        
        double total = hamburgers * precoHamburguer
                     + cheeseburgers * precoCheeseburger
                     + batatas * precoBatata
                     + sumos * precoSumo;

        
        System.out.println();
        System.out.println("Hamburgers\tCheeseburgers\tBatatas fritas\tSumos\tA pagar");
        System.out.printf("%d\t\t%d\t\t%d\t\t%d\t%.2f €%n",
                hamburgers, cheeseburgers, batatas, sumos, total);
    }
}