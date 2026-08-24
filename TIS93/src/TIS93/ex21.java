package TIS93;

import javax.swing.JOptionPane;

public class ex21 {

    public static void main(String[] args) {

        double litros;
        double volumeCamiao;
        int camioes;

        litros = Double.parseDouble(
                JOptionPane.showInputDialog("Quantidade de leite (litros):"));

        volumeCamiao = Math.PI * Math.pow(2, 2) * 6;

      
        volumeCamiao *= 1000;

       
        camioes = (int) Math.ceil(litros / volumeCamiao);

        System.out.printf("Capacidade de um camião: %.2f litros%n", volumeCamiao);
        System.out.println("Quantidade de camiões necessária: " + camioes);
    }
}
