package thema12.oop9.datenstrukturen.comparator.loesung1;

import java.util.Comparator;

public class StudentComparatorByAlter implements Comparator<Student>{
 
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
	}
}

