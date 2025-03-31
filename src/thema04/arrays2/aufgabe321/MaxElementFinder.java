package thema04.arrays2.aufgabe321;

/* 	3.2 Suchen von Array-Elementen

	1. Schreiben Sie ein Java-Programm, das das größte Element in einem Array von ganzen
	Zahlen findet und dieses Element zurückgibt.
*/

public class MaxElementFinder {

	public static void main(String[] args) {
        int[] zahlen = {5, 12, 3, 8, 20, 1};

        // Aufruf der Methode zur Bestimmung des größten Elements
        int maxZahl = findeMax(zahlen);

        System.out.println("Das größte Element im Array ist: " + maxZahl);
    }

    // Methode zur Bestimmung des größten Elements im Array
    private static int findeMax(int[] array) {

        int max = array[0]; // Setze das erste Element als maximal
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Aktualisiere max, wenn ein größeres Element gefunden wird
            }
        }
        return max; // Rückgabe des größten Elements
    }
}