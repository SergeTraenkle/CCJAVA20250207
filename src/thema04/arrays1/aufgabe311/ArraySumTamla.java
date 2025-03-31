package thema04.arrays1.aufgabe311;
/*
3 Arrays
3.1 Einfache Programmierung mit Arrays
1. Schreiben Sie ein Java-Programm, das die Summe aller Elemente in einem Array von
ganzen Zahlen berechnet.
*/
public class ArraySumTamla {
	 
	public static void main(String[] args) {
 
		int [] numbers = {3, 7 , 2, 8, 1};
		printArraySum(numbers);
		
		int [] numbers2 = {33, 22, 1, 100, 15};
		printArraySum(numbers2);
	}
	
	private static int sumArrayElements(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	private static void printArraySum(int[] numbers) {
		System.out.println("Sum is: " + sumArrayElements(numbers));
	}
 
}