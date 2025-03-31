package thema05.oop2.verschachtelung1;
/*
 * Schreiben Sie ein Java-Programm, das die täglichen Temperaturen einer Woche für mehrere Städte speichert 
 * und die durchschnittliche Temperatur für jede Stadt berechnet.
 */
public class AverageTemperature {

    public static void main(String[] args) {
        // Zweidimensionales Array mit Temperaturen für 3 Städte (7 Tage)
        double[][] temperatures = {
            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
            {25.0, 26.3, 24.8, 27.1, 28.2, 26.5, 25.9}  // Stadt 3
        };
        
        // Berechnung der durchschnittlichen Temperaturen
        for (int city = 0; city < temperatures.length; city++) { // Anzahl der Zeilen/Städte
            double sum = 0;
            for (int day = 0; day < temperatures[city].length; day++) { // Anzahl der Spalten/Tagen
                sum += temperatures[city][day];
            }
            double average = sum / temperatures[city].length;
            System.out.printf("Die durchschnittliche Temperatur für Stadt %d beträgt: %.2f°C%n%n", city + 1, average);
        }
    }
}