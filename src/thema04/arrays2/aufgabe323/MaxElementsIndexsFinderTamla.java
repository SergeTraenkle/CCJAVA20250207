package thema04.arrays2.aufgabe323;

/**
* Suchen von Array-Elementen
* Teil 3) Erweitern Sie das Programm weiter, um den Index aller größten Elemente im Array
auszugeben, falls es mehrere gibt.
*/
public class MaxElementsIndexsFinderTamla {
 
	public static void main(String[] args) {
		int [] numbers = {19, 5, 12, 7, 19, 12, 8, 19, 5, 19, 8, 10, 2, 19, 5, 19};
		
		int[] indices = findIndicesOfLargestElements(numbers);
		for (int index : indices) {
			System.out.println(index);
		}
	}
	
	private static int[] findIndicesOfLargestElements(int[] arr) {
		
		// Finde max und zählt wie oft max vorkommt
		int max = arr[0];
		int count = 0;		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				count = 1;
			} else if (arr[i] == max){
				count++;
			}
		}
		
		// Erstelle ein Array aus Indexes, wo max vorkommt.
		int[] indices = new int[count];
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				indices[index] = i;
				index++;
			}
		}
		
		return indices;
	}
}