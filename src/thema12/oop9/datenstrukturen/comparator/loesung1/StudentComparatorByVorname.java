package thema12.oop9.datenstrukturen.comparator.loesung1;

import java.util.Comparator;

public class StudentComparatorByVorname implements Comparator<Student>{
 
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getVorname().compareTo(o2.getVorname());
	}
 
}
 
 