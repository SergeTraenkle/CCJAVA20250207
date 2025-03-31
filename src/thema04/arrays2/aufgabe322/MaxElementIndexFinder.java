package thema04.arrays2.aufgabe322;

public class MaxElementIndexFinder {

    public static void main(String[] args) {
        // Array mit ganzen Zahlen
        int[] zahlen = {5, 12, 3, 8, 20, 1};

        // Aufruf der Methode zur Bestimmung des größten Elements und dessen Index
        Result maxResult = findeMax(zahlen);

        // Ausgabe des größten Elements und seines Index
        System.out.println("Das größte Element im Array ist: " + maxResult.maxValue);
        System.out.println("Der Index des größten Elements ist: " + maxResult.index);
    }
    
    // Methode zur Bestimmung des größten Elements im Array und dessen Index
    private static Result findeMax(int[] array) {
        // Initialisierung von max mit dem ersten Element des Arrays
        int max = array[0]; // Nimmt erstes Element als Startwert
        // Initialisierung des Index mit 0 (dem Index des ersten Elements)
        int index = 0;

        // Schleife durch das Array, beginnend beim zweiten Element
        for (int i = 1; i < array.length; i++) {
            // Überprüfen, ob das aktuelle Element größer ist als max
            if (array[i] > max) {
                // Wenn ja, aktualisiere max auf das aktuelle Element
                max = array[i];
                // Aktualisiere den Index auf die aktuelle Position
                index = i;
            }
        }

        // Initialisierung des Result-Objekts mit einem anderen Namen
        Result findResult = new Result(max, index);
        // Rückgabe des Result-Objekts
        return findResult;
    }

    // Hilfsklasse zur Rückgabe von maximalem Wert und Index
    private static class Result {
        int maxValue; // Variable zur Speicherung des maximalen Wertes
        int index;    // Variable zur Speicherung des Index des maximalen Wertes

        // Konstruktor zur Initialisierung der Variablen
        Result(int maxValue, int index) {
            this.maxValue = maxValue; // Zuweisung des maximalen Wertes
            this.index = index;       // Zuweisung des Index
        }
    }
}
