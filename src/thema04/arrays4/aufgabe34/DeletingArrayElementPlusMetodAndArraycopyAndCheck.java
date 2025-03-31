package thema04.arrays4.aufgabe34;
/*
• Sie können die Methode System.arraycopy() nutzen, um ein neues Array zu erstellen,
das um das gelöschte Element verkürzt ist.
• Wenn das Element nicht gefunden wird, soll das ursprüngliche Array unverändert
zurückgegeben werden.
 */
public class DeletingArrayElementPlusMetodAndArraycopyAndCheck {

    public static void main(String[] args) {

        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Ausgabe des ursprünglichen Arrays
        System.out.println("Gegeben sei das Array:");
        for (int arr : array1)
            System.out.print(arr + " ");
        System.out.println();

        // Element, das entfernt werden soll
        int valueToDelete = 9;

        // Entferne das Element mit dem gesuchten Wert
        int[] array2 = delArrayElement(array1, valueToDelete);

        if (array1 == array2) {
            System.out.println("Das Element " + valueToDelete + " wurde nicht gefunden. Das ursprüngliche Array bleibt unverändert.\n");
        } else {
            System.out.println("Das zu löschende Element ist: " + valueToDelete + "\n");
        }

        // Ausgabe des neuen Arrays
        for (int arr : array2)
            System.out.print(arr + " ");
    }

    private static int[] delArrayElement(int[] array1, int valueToDelete) {
        // Suche den Index des Elements, das entfernt werden soll
        int index = -1; // Das gesuchte Element wurde noch nicht gefunden
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToDelete) {
                index = i;
                break;
            }
        }

        // Wenn das Element nicht gefunden wurde, gib das ursprüngliche Array zurück
        if (index == -1) {
            return array1;
        }

        // Neues Array erstellen, das um ein Element kleiner ist
        int[] array2 = new int[array1.length - 1];

        // Kopiere den Teil vor dem zu löschenden Element
        System.arraycopy(array1, 0, array2, 0, index);

        // Kopiere den Teil nach dem zu löschenden Element
        System.arraycopy(array1, index + 1, array2, index, array1.length - index - 1);

        return array2;
    }
}