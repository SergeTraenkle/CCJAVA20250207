package thema04.arrays4.aufgabe34;
/*
3.4 Löschen von Array-Elementen
Schreiben Sie ein Java-Programm, das ein bestimmtes Element aus einem Array löscht
und das modifizierte Array zurückgibt.
*/
public class DeletingArrayElement {

	public static void main(String[] args) {

		int array1 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Gegeben sei das Array:");
		for (int arr : array1) 
			System.out.print(arr + " ");
		System.out.print("\n");

		int index = 2;
		System.out.println("Das zu löschende Element ist: " + array1 [index] + "\n");
		int array2 [] = new int [array1.length-1];
		
		for (int i = 0, j = 0; i < array1.length; i++) {
			if (i != index) {
				array2 [j] = array1 [i];
				j++;
			}
		}
		
		for (int arr : array2) 
			System.out.print(arr + " ");
	}

}
