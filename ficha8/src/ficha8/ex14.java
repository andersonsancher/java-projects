package ficha8;

public class ex14 {

    public static void main(String[] args) {

        int i;
        String resultado = "";

        i = 1;

        do {

            resultado = resultado + i + "\t";

            if (i % 10 == 0) {
                resultado = resultado + "\n";
            }

            i++;

        } while (i <= 50);

        javax.swing.JOptionPane.showMessageDialog(null, resultado);

    }

}