package thema04.arrays0.warmup.random;

import java.util.Iterator;

public class RandomProgram {
    public static void main(String[] args) {
        int[] randomValues = new int[50];
        // Random-Schleife
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = (int) (Math.random() * 10);
        }
        // Ausgabe-Schleife
        for (int i = 0; i < randomValues.length; i++) {
            System.out.print(randomValues[i] + " ");
        }
    }
}
