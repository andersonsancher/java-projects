package ficha8;

public class ex1_f {

    public static void main(String[] args) {

        int i = 80;

        do {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }

            i++;

        } while (i <= 120);

    }
}