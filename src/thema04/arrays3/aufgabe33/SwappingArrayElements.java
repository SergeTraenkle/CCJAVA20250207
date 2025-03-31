package thema04.arrays3.aufgabe33;

import java.util.Arrays;

public class SwappingArrayElements {

	public static void main(String[] args) {

        int[] array = {4, 2, 10, 3, -5, 0, 17};
        int index1 = 3;
        int index2 = 5;    
        
        // Vor dem Tausch: 
        System.out.println("Feld: \t\t" +  Arrays.toString(array));
        System.out.println("Index 1:  " + index1 + "\nIndex 2:  " + index2);
        swap(array, index1, index2); 
        
        // Nach dem Tausch
        System.out.println("neues Feld: \t" +  Arrays.toString(array));
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j]; // Tausch Nr. 1
		array[j] = temp; // Tausch Nr. 2
	}

}
