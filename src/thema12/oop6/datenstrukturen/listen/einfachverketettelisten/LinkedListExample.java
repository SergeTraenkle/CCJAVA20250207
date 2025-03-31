package thema12.oop6.datenstrukturen.listen.einfachverketettelisten;

import java.util.LinkedList;

public class LinkedListExample { 
    public static void main(String[] args) { 
        LinkedList<String> list = new LinkedList<>();
        list.add("X"); 
        list.addFirst("Y");
        list.addLast("Z");
        System.out.println("LinkedList: " + list);
    }
}