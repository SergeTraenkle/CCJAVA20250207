package thema12.oop8.datenstrukturen.mengen.set.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetExample2 { 
    public static void main(String[] args) { 
        // HashSet erstellen
    	HashSet<String> names = new HashSet<>();
    	names.add("Alice");
    	names.add("Bob");
    	names.add("Charlie");

    	System.out.println("---Ausgabe ohne for-Schleife:---");
    	System.out.println(names);
   	
    	System.out.println("---Ausgabe mit for-Schleife:---");
    	for (String name : names) {
    	    System.out.println(name);
    	}

    	System.out.println("---Ausgabe mit Iterator:---");
    	Iterator<String> iterator = names.iterator();
    	while (iterator.hasNext()) {
    	    System.out.println(iterator.next());
    	}   
  
    	System.out.println("---Ausgabe mit Sotrtierung:---");
    	List<String> sortedList = new ArrayList<>(names);
    	Collections.sort(sortedList);
    	System.out.println(sortedList);
    }
}

