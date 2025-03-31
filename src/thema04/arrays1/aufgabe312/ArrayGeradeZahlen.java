package thema04.arrays1.aufgabe312;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayGeradeZahlen {
    public static void main(String[] args) {
    	int elementenAnzahl = 20;
        int[] array1 = new int[elementenAnzahl];
        int[] array2 = new int[elementenAnzahl];
        int randomElement = 0;
        // Random-Schleife mit geraden Zahlen
        for (int i = 0; i < array1.length; i++) {
        	randomElement = (int) (Math.random() * 10);
        	if (randomElement % 2 == 0) {
                array1[i] = randomElement;     		
        	}
        }
        // Ausgabe für Schleife
        System.out.println(elementenAnzahl + " geraden Array-Elemente:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        // Ausgabe mit Arrays.toString()
        System.out.println("\n" + Arrays.toString(array1));
        
        // Summe aller Array-Elemente
        int sum = 0;
        for (int i  = 0; i < array1.length; i++) {
        	sum += array1[i];
        }
        System.out.println("\n\nSumme aller Array-Elemente: " + sum + "\n\n");     

        // Random-Schleife
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10);  
        }
 
        // Ausgabe für Schleife
        System.out.println(elementenAnzahl + " ganzen Array-Elemente unsortiert:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
       
        Arrays.sort(array2);
        // Ausgabe für Schleife
        System.out.println("\n\n" + elementenAnzahl + " ganzen Array-Elemente sortiert:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        // Ausgabe mit Arrays.toString()
        System.out.println("\n" + Arrays.toString(array2));
    }
}
