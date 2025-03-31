package thema04.arrays4.aufgabe34;
	/**
	* 3.4 Löschen von Array-Elementen. DeleteElementFromArray
	*/
public class DeletingArrayElementPlusMetodAndArraycopyAndCheckTamla {
	 
		public static void main(String[] args) {
	 
			int[] arr = {3, 4, 1, 9, -5, 4};
			int elementToDelete = 9;
			
			System.out.println("Array: ");
			printArray(arr);
			
			System.out.println("Zu löschendes Element: " + elementToDelete);
			int[] modifiedArray = deleteArrayElement(arr, elementToDelete);
			printArray(modifiedArray);
		}
		
		private static int[] deleteArrayElement(int[] arr, int elementToDelete) {
	 
			int index = -1;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == elementToDelete) {
					index = i;
					break;
				}
			}
			
			if(index == -1) {
				return arr;
			}

			// 3, 4, 1, 9, -5, 4
			// 3, 4, 1, -5, 4
			// Element nach links verschieben (überschreiben)
			// Ab der gefundenen Position (index) wird jedes nachfolgende Element eine
			// Position nach links verschoben.
			// Dadurch wird das löschende Element "überschrieben"
			for(int i = index; i < arr.length - 1; i++) {
				arr[i] = arr[i+1];
			}
			
			// Erstellen eines neuen Arrays  mit verminderter Größe arr.length-1
			// System.arracopy kopiert die ersten newArray.length Elemente aus arr in das
			// neue Array
			// das neue Array wird zurückgeben
			int[] newArray = new int[arr.length -1];
			System.arraycopy(arr, 0, newArray, 0, newArray.length);
			return newArray;
		}
	 
		private static void printArray(int[] arr) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}