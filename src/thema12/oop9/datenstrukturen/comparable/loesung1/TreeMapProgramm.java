package thema12.oop9.datenstrukturen.comparable.loesung1;

import java.util.TreeMap;

public class TreeMapProgramm {

	public static void main(String[] args) {

		TreeMap<Integer, Student> mapStudent = new TreeMap<>();
		
		Student student1  = new Student(309767, "Lukas", "Kasmenis", "lukas@example.com");
		Student student2 = new Student(309768, "Anna", "Müller", "anna@example.com");
		
		mapStudent.put(1, student1);
		mapStudent.put(2, student2);

		
		// Informationen aus dem Map (Schlüssel, Student Information) ausgeben
		System.out.println("Student Map:");
		for (Integer key : mapStudent.keySet()) { // for-Schleife durchläuft alle Schlussel in der HashMap
		    Student student = mapStudent.get(key);// Für jeden Schlüssel wird entsprechende Student-Objekt aus Map
		    // geholt

		    System.out.println(
		    		"Schlüssel: " + key + ", " + 
		    		"Student: " + student.getVorname() + " " + student.getNachname() + ", Matrikelnummer: " + 
		    		student.getMatrikelNummer() + ", E-Mail: " + 
		    		student.getEmail());
		    // nutzt Getter-Methoden
		    // Direktzugriff auf private Attribute ersetzt durch Getter-Methoden, da direkter Zugriff nicht erlaubt ist
		}
			
		
	}

	
}
