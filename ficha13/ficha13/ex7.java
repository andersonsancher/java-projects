package ficha13;

import java.util.Random;

public class ex7 {

    public static void main(String[] args) {
        Random rand = new Random();

        final int DIAS = 30;
        int[] minimas = new int[DIAS];
        int[] maximas = new int[DIAS];

        
        for (int i = 0; i < DIAS; i++) {
            minimas[i] = -5 + rand.nextInt(41); 

            int maxima;
            do {
                maxima = -5 + rand.nextInt(41);
            } while (maxima < minimas[i]); 
            maximas[i] = maxima;
        }

        
        System.out.println("Temperaturas do mês:");
        for (int i = 0; i < DIAS; i++) {
            System.out.println("Dia " + (i + 1) + ": mínima = " + minimas[i] + "º, máxima = " + maximas[i] + "º");
        }

        
        int maiorAmplitude = maximas[0] - minimas[0];
        int diaMaiorAmplitude = 0;

        for (int i = 1; i < DIAS; i++) {
            int amplitude = maximas[i] - minimas[i];
            if (amplitude > maiorAmplitude) {
                maiorAmplitude = amplitude;
                diaMaiorAmplitude = i;
            }
        }

        System.out.println("\nMaior amplitude térmica: " + maiorAmplitude
                + "º, no dia " + (diaMaiorAmplitude + 1));
    }
}