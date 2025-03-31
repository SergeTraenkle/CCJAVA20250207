package thema04.arrays4.aufgabe34;
/*
• Schreiben Sie eine Methode deleteArrayElement mit zwei Parametern: das Array
(a) und den zu löschenden Wert (w). Diese Methode sucht nach Wert w im Array
und entfernt es, wenn es gefunden wird.
*/
public class DeletingArrayElementPlusMetod {

	public static void main(String[] args) {

		int array1 [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Ausgabe des ursprünglichen Arrays
		System.out.println("Gegeben sei das Array:");
		for (int arr : array1) 
			System.out.print(arr + " ");
		System.out.print("\n");

		// Entferne das Element an Index 2
		int index = 2;
		int [] array2 = delArrayElement(array1, index);
		System.out.println("Das zu löschende Element ist: " + array1 [index] + "\n");
		// Ausgabe des neuen Arrays
		for (int arr : array2) 
			System.out.print(arr + " ");	
	}

	private static int [] delArrayElement(int [] array1, int index) {
		// Neues Array erstellen
		int array2 [] = new int [array1.length-1];
		for (int i = 0, j = 0; i < array1.length; i++) {
			if (i != index) {
				array2 [j] = array1 [i];
				j++;
			}
		}
		return array2;
	}
}




	
	
