package thema05.oop2.verschachtelung1;
/*
 * Schreiben Sie ein Java-Programm, das eine Liste von Passwörtern überprüft und angibt, ob sie stark oder schwach sind. 
 * Ein starkes Passwort muss mindestens 8 Zeichen lang sein und sowohl Buchstaben als auch Zahlen enthalten.
 */

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        // Array mit Passwörtern
        String[] passwords = {"Pass1234", "123456", "password", "Strong1", "WeakPass", "Secure1!"};
        
        // Überprüfung jedes Passworts
        for (String password : passwords) { // oder for (int i = 0; i < passwords.length; i++) {}
            if (isStrong(password)) {
                System.out.printf("Das Passwort \"%s\"\t ist stark.%n", password);
            } else {
                System.out.printf("Das Passwort \"%s\"\t ist schwach.%n", password);
            }
        }
    }
    // Methode zur Überprüfung, ob ein Passwort stark ist
    public static boolean isStrong(String password) {
        // Überprüfen, ob das Passwort mindestens 8 Zeichen lang ist
        if (password.length() < 8) {
            return false;
        }

        // Flags für Buchstaben und Zahlen
        boolean hasLetter = false;
        boolean hasDigit = false;
		
		}
        // Überprüfen, ob das Passwort Buchstaben und Zahlen enthält
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) { // Wenn c ein Buchstabe ist
                hasLetter = true;
            } else if (Character.isDigit(c)) { // Wenn c eine Zahl ist
                hasDigit = true;
            }

            // Wenn beide Bedingungen erfüllt sind, ist das Passwort stark
            if (hasLetter && hasDigit) {
                return true;
            }
        }
        // Wenn entweder Buchstaben oder Zahlen fehlen, ist das Passwort schwach
        return false;
    }
}