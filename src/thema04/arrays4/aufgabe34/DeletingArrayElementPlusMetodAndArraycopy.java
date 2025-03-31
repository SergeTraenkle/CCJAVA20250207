package thema04.arrays4.aufgabe34;
/*
• Sie können die Methode System.arraycopy() nutzen, um ein neues Array zu erstellen,
das um das gelöschte Element verkürzt ist.
• Wenn das Element nicht gefunden wird, soll das ursprüngliche Array unverändert
zurückgegeben werden.
 */
public class DeletingArrayElementPlusMetodAndArraycopy {

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
		// Neues Array erstellen, das um ein Element kleiner ist
		int array2 [] = new int [array1.length-1];

	    // Kopiere den Teil vor dem zu löschenden Element
        System.arraycopy(array1, 0, array2, 0, index); // index: Die Anzahl der zu kopierenden Elemente
        
        // Kopiere den Teil nach dem zu löschenden Element
        System.arraycopy(array1, index + 1, array2, index, array1.length - index - 1);
		
		return array2;
	}
}

