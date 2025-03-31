package thema12.oop9.datenstrukturen.comparator.loesung1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainProgramm {

	public static void main(String[] args) {
		
		Student s1 = new Student(1001, "Max", "Müller", "max.mueller@example.com");
        s1.setAge(22);
		Student s2 = new Student(1002, "Anna", "Schmidt", "anna.schmidt@example.com");
		s2.setAge(25);
		Student s3 = new Student(1003, "Tom", "Meier", "tom.meier@example.com");
		s3.setAge(35);
		Student s4 = new Student(1004, "Lisa", "Meier", "lisa.meier@example.com");
        s4.setAge(22);
		Student s5 = new Student(1004, "Lisa", "Marie", "lisa.meier@example.com");
        s4.setAge(19);
        
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        
        Collections.sort(studentList, new StudentComparatorByVorname());
        // Collections.sort(studentList, new StudentComparatorByAlter());
        for (Student student : studentList) {
			System.out.println(student);
		}
 				
	}

}



