package thema12.oop9.datenstrukturen.comparable.loesung2;

import thema12.oop9.datenstrukturen.mengen.map.warmup.Student;

public class MainProgramm {

	public static void main(String[] args) {

		Student s1 = new Student(1001, "Max", "Müller", "max.mueller@example.com");
		s1.setAge(27);
        Student s2 = new Student(1002, "Anna", "Schmidt", "anna.schmidt@example.com");
        s1.setAge(25);
        Student s3 = new Student(1003, "Tom", "Meier", "tom.meier@example.com");
        s1.setAge(35);
        
        /**
         * Werte von der Methode compareTo()
         * <0, wenn aktuelle Objekt kleiner ist als das übergebene Objekt
         * =0, wenn beide Objekte gleich sind
         * >0, wenn das aktuelle Objekt größer als das übergebene Objekt ist.
         */
        int result = s1.compareTo(s4);
		if(result < 0) {
			System.out.println("Student "
			        + s1.getMatrikelNummer()
			        + " kommt vor Student "
			        + s4.getMatrikelNummer() + " in der Sortierung.");
		} else if(result == 0) {
			System.out.println("Student "
					+ s1.getMatrikelNummer()
					+ "und Student "
					+ s4.getMatrikelNummer()
					+ " sind gleich in der Sortierung");
		} else {
			 System.out.println("Student "
				        + s1.getMatrikelNummer()
				        + " kommt nach Student "
				        + s4.getMatrikelNummer() + " in der Sortierung.");
		}

}
