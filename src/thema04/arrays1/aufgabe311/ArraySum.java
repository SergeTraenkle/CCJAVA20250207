package thema04.arrays1.aufgabe311;
/*
3 Arrays
3.1 Einfache Programmierung mit Arrays
1. Schreiben Sie ein Java-Programm, das die Summe aller Elemente in einem Array von
ganzen Zahlen berechnet.
*/
import java.util.Iterator;

// Summe von Array-Elemente
public class ArraySum {

	public static void main(String[] args) {

		int elementenAnzahl = 20;
        int[] array = new int[elementenAnzahl];
        // Random-Schleife
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()+0.1) * 9);
        }

        // Ausgabe für Schleife
        System.out.println(elementenAnzahl + " Array-Elemente:\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        // Berechnung der Summe aller Array-Elemente
        int sum = 0;
        for (int i  = 0; i < array.length; i++) {
        	sum += array[i];
        }
        System.out.println("\n\nSumme aller Array-Elemente: " + sum);        
    }
}
