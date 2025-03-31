package thema04.arrays2.aufgabe321;

/**
* Suchen von Array-Elementen
* Teil 1) Schreiben Sie ein Java-Programm, das das größte Element in einem Array von ganzen
Zahlen findet und dieses Element zurückgibt.
*/
public class MaxElementFinderTamla {
 
	public static void main(String[] args) {
		int [] numbers = {5, 12, 7, 19, 12, 170};
		
		int largestElement = findLargestElement(numbers);		// Teil 1
		
		System.out.println("The largest element is: "
		+ largestElement);
	}
	
	private static int findLargestElement(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}		
		return max;
	}
}
