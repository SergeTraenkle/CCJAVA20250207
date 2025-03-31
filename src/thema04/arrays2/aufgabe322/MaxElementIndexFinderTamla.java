package thema04.arrays2.aufgabe322;

/**
* Suchen von Array-Elementen
* Teil 2) Finde die Index für das größte Element.
*/

public class MaxElementIndexFinderTamla {
	 
	public static void main(String[] args) {
		int [] numbers = {5, 12, 7, 19, 12, 170};
		
		int largestElement = findLargestElement(numbers);
		int largestElementIndex = findLargestElementIndex(numbers);
		
		System.out.println("The largest element is: "
		+ largestElement
		+ " with index: "
		+ largestElementIndex);
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
	
	private static int findLargestElementIndex(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}		
		return maxIndex;
	}
}